import Carro.Carro;
import Cliente.Cliente;

public class Emprestimo {
    private Cliente cliente;
    private Carro carro;
    private int qntdRenovacoes;

    public Emprestimo(Cliente cliente, Carro carro) {
        this.cliente = cliente;
        this.carro = carro;
        this.qntdRenovacoes = 0;
    }
}
