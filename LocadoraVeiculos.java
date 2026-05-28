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
    public void realizarEmpréstimo(){

    }
    public Cliente buscarCliente(String telefone){
        for(int i = 0; i < clientes.size(); i++){
            if(telefone.equals(clientes.get(i).getTelefone())){
                return clientes.get(i);
            }
        }
        System.out.println("Cliente não encontrado!");
        return null;
    }
    public Carro buscarCarro(String placa){
        for(int i = 0; i < carros.size(); i++){
            if(placa.equals(carros.get(i).getPlaca())){
                return carros.get(i);
            }
        }
        System.out.println("Carro não encontrado!");
        return null;
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
