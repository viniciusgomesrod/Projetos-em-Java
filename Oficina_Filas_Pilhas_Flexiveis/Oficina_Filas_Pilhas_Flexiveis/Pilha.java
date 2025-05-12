import java.util.NoSuchElementException;

public class Pilha<E> {

	private Celula<E> topo;
	private Celula<E> fundo;

	public Pilha() {

		Celula<E> sentinela = new Celula<E>();
		fundo = sentinela;
		topo = sentinela;

	}

	public boolean vazia() {
		return fundo == topo;
	}

	public void empilhar(E item) {

		topo = new Celula<E>(item, topo);
	}

	public E desempilhar() {

		E desempilhado = consultarTopo();
		topo = topo.getProximo();
		return desempilhado;

	}

	public E consultarTopo() {

		if (vazia()) {
			throw new NoSuchElementException("Nao há nenhum item na pilha!");
		}

		return topo.getItem();

	}

	
	public Pilha<E> subPilha(int numItens) {
        Pilha<E> subPilha = new Pilha<>();
        Pilha<E> auxiliar = new Pilha<>();

        Celula<E> atual = topo;
        int count = 0;

        while (atual != null && count < numItens) {
            auxiliar.empilhar(atual.getItem());
            atual = atual.getProximo();
            count++;
        }

        while (!auxiliar.vazia()) {
            subPilha.empilhar(auxiliar.desempilhar());
        }

        return subPilha;
    }

	public void imprimir() {
		
		for(Celula<E> i = topo; i!= fundo; i = i.getProximo()){
			System.out.println(i.getItem());

		}
	}

}
