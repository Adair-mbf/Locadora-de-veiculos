import Carro.Carro;
import Cliente.Cliente;

public class Emprestimo {
    private Cliente cliente;
    private Carro carro;
    private int qntdRenovacoes;
    private double valorMulta;

    public Emprestimo(Cliente cliente, Carro carro) {
        this.cliente = cliente;
        this.carro = carro;
        this.qntdRenovacoes = 0;
        this.valorMulta = 0;
    }
}
