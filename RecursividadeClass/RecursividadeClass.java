import java.util.Scanner;

public class RecursividadeClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;
        int nfibo;
        int nfatorial;
        boolean resposta;
        String palavra;
        int indice;
    
        do {
            System.out.println("\n============================================");
            System.out.println("\nSelecione o método recursivo desejado:\n");
            System.out.println("1. Fibonacci");
            System.out.println("2. Fatorial");
            System.out.println("3. Palíndromo");
            System.out.println("4. Encontrar a posicao de um numero em um vetor");
            System.out.println("5. Sair");
            System.out.print("\nEscolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu o método fibonacci");
                    System.out.println("Digite a posicao de um elemento para saber o valor por fibonacci: ");
                    nfibo = scanner.nextInt();
                    System.out.println("Fibonacci de " + nfibo + " é: " + fibonacci(nfibo));
                    break;
                case 2:
                    System.out.println("Você escolheu o método fatorial");
                    System.out.println("Digite o número que quer saber o fatorial: ");
                    nfatorial = scanner.nextInt();
                    System.out.println("Resultado do metodo recursivo 2: " + fatorial(nfatorial));
                    break;
                case 3:
                    System.out.println("Você escolheu o método palindromo");
                    System.out.println("Digite a palvra a verificar se ao contrário é a mesma. Exemplo: ARARA ao contrário é ARARA");
                    palavra = scanner.next();
                    System.out.println("Resultado do metodo recursivo 3: ");
                    break;
                case 4:
                    System.out.print("Digite o tamanho do vetor: ");
                    int n = scanner.nextInt();
                    int[] vet = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        vet[i] = scanner.nextInt();
                    }
                    System.out.print("Digite o numero a ser encontrado: ");
                    int x = scanner.nextInt();
                    System.out.println("Numero " + x + " -> posicao: " + encontrar(vet, n, x));
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    public static int fibonacci(int nfibo) {

        if (nfibo == 1 || nfibo == 2) {
            return 1;
        } else {
            return (fibonacci(nfibo - 1) + fibonacci(nfibo - 2));
        }
    }

    public static int fatorial(int nfatorial) {

        if(nfatorial == 0) {
            return 1;
        } else {
            return nfatorial * fatorial(nfatorial - 1);
        }
    }

    public static boolean palindromo(String palavra, int indice) {

        if (charAt(index) != charAt(palavra.length() - (1 + indice))) {
            return false;
        }
        return resposta;

    }

    public static int encontrar(int[] A, int n, int x){
        int pos = -1;
        if(n>0){
            if(A[n-1] == x){
                pos = n-1;
            } else {
                pos = encontrar(A, n-1, x);
            }
        }
        return pos;
    }

}
