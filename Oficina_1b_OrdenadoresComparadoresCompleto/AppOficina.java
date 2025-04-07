
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class AppOficina {

    static final int MAX_PEDIDOS = 100;
    static Produto[] produtos;
    static int quantProdutos = 0;
    static String nomeArquivoDados = "produtos.txt";
    static IOrdenador<Produto> ordenador;

    // #region utilidades
    static Scanner teclado;
    static Produto[] produtosOrdenadosIdentif;
    static Produto[] produtosOrdenadosDescr;

    

    static <T extends Number> T lerNumero(String mensagem, Class<T> classe) {
        System.out.print(mensagem + ": ");
        T valor;
        try {
            valor = classe.getConstructor(String.class).newInstance(teclado.nextLine());
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            return null;
        }
        return valor;
    }

    static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void pausa() {
        System.out.println("Tecle Enter para continuar.");
        teclado.nextLine();
    }

    static void cabecalho() {
        limparTela();
        System.out.println("XULAMBS COMÉRCIO DE COISINHAS v0.2\n================");
    }
    

    static int exibirMenuPrincipal() {
        cabecalho();
        System.out.println("1 - Procurar produto");
        System.out.println("2 - Filtrar produtos por preço máximo");
        System.out.println("3 - Ordenar produtos");
        System.out.println("4 - Embaralhar produtos");
        System.out.println("5 - Listar produtos");
        System.out.println("0 - Finalizar");
       
        return lerNumero("Digite sua opção", Integer.class);
    }

    static int exibirMenuOrdenadores() {
        cabecalho();
        System.out.println("1 - Bolha");
        System.out.println("2 - Inserção");
        System.out.println("3 - Seleção");
        System.out.println("4 - Mergesort");
        System.out.println("0 - Finalizar");
       
        return lerNumero("Digite sua opção", Integer.class);
    }

    static int exibirMenuComparadores() {
        cabecalho();
        System.out.println("1 - Padrão");
        System.out.println("2 - Por código");
        
        return lerNumero("Digite sua opção", Integer.class);
    }

    // #endregion
    static Produto[] carregarProdutos(String nomeArquivo){
        Scanner dados;
        Produto[] dadosCarregados;
        try {
            dados = new Scanner(new File(nomeArquivo));
            int tamanho = Integer.parseInt(dados.nextLine());
    
            dadosCarregados = new Produto[tamanho];
            quantProdutos = 0; // Resetar contador antes de carregar
            while (dados.hasNextLine()) {
                Produto novoProduto = Produto.criarDoTexto(dados.nextLine());
                dadosCarregados[quantProdutos] = novoProduto;
                quantProdutos++;
            }
            dados.close();
    
            // Agora sim, fazer as cópias com base em dadosCarregados
            produtosOrdenadosIdentif = Arrays.copyOf(dadosCarregados, quantProdutos);
            Arrays.sort(produtosOrdenadosIdentif, (a, b) -> a.hashCode() - b.hashCode());
    
            produtosOrdenadosDescr = Arrays.copyOf(dadosCarregados, quantProdutos);
            Arrays.sort(produtosOrdenadosDescr); // Usa compareTo()
    
        } catch (FileNotFoundException fex) {
            System.out.println("Arquivo não encontrado. Produtos não carregados");
            dadosCarregados = null;
        }
        return dadosCarregados;
    }


    static Produto localizarProduto() {
        cabecalho();
        System.out.println("Localizando um produto");
        System.out.println("Deseja localizar por:");
        System.out.println("1 - Identificador");
        System.out.println("2 - Descrição");
    
        int opcao = lerNumero("Escolha a opção", Integer.class);
        Produto encontrado = null;
    
        if (opcao == 1) {
            int id = lerNumero("Digite o identificador", Integer.class);
    
            for (int i = 0; i < produtosOrdenadosIdentif.length; i++) {
                Produto p = produtosOrdenadosIdentif[i];
                if (p.hashCode() == id) {
                    encontrado = p;
                    break;
                } else if (p.hashCode() > id) {
                    break; // Não adianta continuar, já passou do valor
                }
            }
    
        } else if (opcao == 2) {
            String desc = lerTexto("Digite a descrição").toUpperCase();
    
            for (int i = 0; i < produtosOrdenadosDescr.length; i++) {
                Produto p = produtosOrdenadosDescr[i];
                if (p.getDescricao().toUpperCase().equals(desc)) {
                    encontrado = p;
                    break;
                } else if (p.getDescricao().toUpperCase().compareTo(desc) > 0) {
                    break; // A partir daqui, nenhuma descrição será menor ou igual
                }
            }
        } else {
            System.out.println("Opção inválida.");
        }
    
        return encontrado;
    }

    private static void mostrarProduto(Produto produto) {
        cabecalho();
        String mensagem = "Dados inválidos";
        
        if(produto!=null){
            mensagem = String.format("Dados do produto:\n%s", produto);            
        }
        
        System.out.println(mensagem);
    }

    private static void filtrarPorPrecoMaximo(){
        cabecalho();
        System.out.println("Filtrando por valor máximo:");
        double valor = lerNumero("valor", Double.class);
        StringBuilder relatorio = new StringBuilder();
        for (int i = 0; i < quantProdutos; i++) {
            if(produtos[i].valorDeVenda() < valor)
            relatorio.append(produtos[i]+"\n");
        }
        System.out.println(relatorio.toString());
    }

    static void ordenarProdutos(){
        cabecalho();
        
        int opcao = exibirMenuOrdenadores();
        switch (opcao) {
            case 1 -> ordenador = new Bubblesort<>();
            case 2 -> ordenador = new InsertSort<>();
            case 3 -> ordenador = new SelectionSort<>();
            case 4 -> ordenador = new Mergesort<>();
        }

        if(ordenador!=null){
            opcao = exibirMenuComparadores();
            switch (opcao) {
                case 2 -> produtos = ordenador.ordenar(produtos, (a,b) -> (a.hashCode()-b.hashCode()));
                default -> produtos = ordenador.ordenar(produtos);
            }
            
            System.out.println("Tempo gasto: "+ordenador.getTempoOrdenacao()+" ms.");
        }
        ordenador = null;
    }

    static void embaralharProdutos(){
        Collections.shuffle(Arrays.asList(produtos));
    }

    static void verificarSubstituicao(Produto[] dadosOriginais, Produto[] copiaDados){
        cabecalho();
        System.out.print("Deseja sobrescrever os dados originais pelos ordenados (S/N)?");
        String resposta = teclado.nextLine().toUpperCase();
        if(resposta.equals("S"))
            dadosOriginais = Arrays.copyOf(copiaDados, copiaDados.length);
    }

    static void listarProdutos(){
        cabecalho();
        for (int i = 0; i < quantProdutos; i++) {
            System.out.println(produtos[i]);
        }
    }

    private static String lerTexto(String mensagem) {
        System.out.print(mensagem + ": ");
        return teclado.nextLine();
    }

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        
        produtos = carregarProdutos(nomeArquivoDados);
        embaralharProdutos();

        int opcao = -1;
        
        do {
            opcao = exibirMenuPrincipal();
            switch (opcao) {
                case 1 -> mostrarProduto(localizarProduto());
                case 2 -> filtrarPorPrecoMaximo();
                case 3 -> ordenarProdutos();
                case 4 -> embaralharProdutos();
                case 5 -> listarProdutos();
                case 0 -> System.out.println("FLW VLW OBG VLT SMP.");
            }
            pausa();
        }while (opcao != 0);
        teclado.close();
    }                        
}
