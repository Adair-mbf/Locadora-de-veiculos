import java.util.ArrayList;

import Carro.Carro;
import Cliente.Cliente;

public class LocadoraVeiculos {
    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Carro> carros;
    private ArrayList<Cliente> clientes;
    private ArrayList<Emprestimo> emprestimos;

    public void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void cadastrarVeiculo(Carro carro){
        carros.add(carro);
    }

    public LocadoraVeiculos(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.carros = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }
}
