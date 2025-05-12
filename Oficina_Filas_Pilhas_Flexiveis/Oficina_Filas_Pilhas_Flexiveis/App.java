public class App {
    

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        pilha.empilhar(4);
        pilha.empilhar(7);
        pilha.empilhar(5);
        pilha.empilhar(8);
        pilha.empilhar(11);

        System.out.print("Pilha original: ");
        pilha.imprimir();

        Pilha<Integer> nova = pilha.subPilha(4);
        System.out.print("SubPilha com 3 itens do topo: ");
        nova.imprimir();

    }

}
