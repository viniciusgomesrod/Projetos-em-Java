import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private int documento;
    private List<Pedido> pedidos;

    public Cliente(String nome, int documento) {
        if(!nome.contains(" ") || nome.split(" ").length != 2)
            throw new IllegalArgumentException("Favor cadastrar cliente com um nome e um sobrenome");
        if(documento < 10_000)
            throw new IllegalArgumentException("Documentos válidos devem ter pelo menos 5 dígitos");
        
        this.documento = documento;
        this.nome = nome;
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido novo) {
        if (novo == null) {
            throw new IllegalArgumentException("Pedido não pode ser nulo");
        }
        pedidos.add(novo);
    }

    public double totalGasto() {
        double total = 0.0;
        for (Pedido pedido : pedidos) {
            total += pedido.valorFinal(); // Alterado de getValorTotal() para valorFinal()
        }
        return total;
    }

    @Override
    public String toString() {
        return nome + " (" + documento + ")";
    }
    
    @Override
    public int hashCode() {
        return documento;
    }
    
    public List<Pedido> getPedidos() {
        return pedidos;
    }
}