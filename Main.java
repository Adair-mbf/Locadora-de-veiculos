import java.util.Scanner;

import Carro.CarroLuxo;
import Carro.CarroPopular;
import Carro.CarroSuv;
import Cliente.Cliente;
import Cliente.PessoaFisica;
import Cliente.PessoaJuridica;

public class Main{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        LocadoraVeiculos locadoraVeiculos = new LocadoraVeiculos("locaVasp", "Rua enidio oliveira campos, numero 618, Alvorecer, Aguas claras - GO", "+5564956541234");
        byte opcao;
        do{
            System.out.println("O que deseja fazer:");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Cadastrar cliente");
            System.out.println("3 - Realizar um empréstimo de veículo");
            System.out.println("4 - Renovar um empréstimo de veículo")
            System.out.println("5 - Finalizar um empréstimo de veículo");
            System.out.println("0 - Sair");

            opcao = leitor.nextByte();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("Digite a marca do carro:");
                    String marca = leitor.nextLine();
                    System.out.println("Digite o modelo do carro:");
                    String modelo = leitor.nextLine();
                    System.out.println("Digite a placa do carro:");
                    String placa = leitor.nextLine();
                    System.out.println("Digite o ano do carro:");
                    String ano = leitor.nextLine();
                    System.out.println("Digite o valor da locação do carro:");
                    double valorLocacao = leitor.nextDouble();
                    System.out.println("Digite o tipo do carro:");
                    System.out.println("1 - Carro de luxo");
                    System.out.println("2 - Carro popular");
                    System.out.println("3 - Carro SUV");
                    byte opcaoCarro = leitor.nextByte();
                    switch (opcaoCarro) {
                        case 1:{
                            System.out.println("Digite a quantidade de airbags:");
                            int qntdArbags = leitor.nextInt();
                            System.out.println("Digite o tamanho do porta-malas(em litros):");
                            double tamanhoPortaMalas = leitor.nextDouble();
                            System.out.println("Possui GPS integrado?");
                            boolean possuiGpsIntegrado = leitor.nextBoolean();
                            CarroLuxo carro = new CarroLuxo(marca, modelo, placa, ano, valorLocacao, qntdArbags, tamanhoPortaMalas, possuiGpsIntegrado);
                            locadoraVeiculos.cadastrarVeiculo(carro);
                            break;
                        }
                        case 2:{
                            System.out.println("Possui ar-condicionado?");
                            boolean possuiArCondicionado = leitor.nextBoolean();
                            CarroPopular carro = new CarroPopular(marca, modelo, placa, ano, valorLocacao, possuiArCondicionado);
                            locadoraVeiculos.cadastrarVeiculo(carro);
                            break;
                        }
                        case 3:{
                            System.out.println("Digite o tamanho do porta-malas(em litros):");
                            double tamanhoPortaMalas = leitor.nextDouble();
                            System.out.println("Digite o tipo de tração:");
                            String tipoTracao = leitor.nextLine();
                            System.out.println("Digite o tipo de combustível:");
                            String tipoCombustivel = leitor.nextLine();
                            CarroSuv carro = new CarroSuv(marca, modelo, placa, ano, valorLocacao, tamanhoPortaMalas, tipoTracao, tipoCombustivel);
                            locadoraVeiculos.cadastrarVeiculo(carro);
                            break;
                        }
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome do cliente:");
                    String nome = leitor.nextLine();
                    System.out.println("Digite o telefone do cliente:");
                    String telefone = leitor.nextLine();
                    System.out.println("Digite o endereco do cliente:");
                    String endereco = leitor.nextLine();

                    System.out.println("Selecione o tipo de cliente:");
                    System.out.println("1 - Pessoa Física");
                    System.out.println("2 - Pessoa jurídica");

                    byte opcaoCliente = leitor.nextByte();
                    switch (opcaoCliente) {
                        case 1:{
                            System.out.println("Digite o cpf do cliente:");
                            String cpf = leitor.nextLine();
                            Cliente cliente = new PessoaFisica(nome, telefone, endereco, cpf);
                            locadoraVeiculos.cadastrarCliente(cliente);
                            break;
                        }
                        case 2:{
                            System.out.println("Digite o cnpj do cliente:");
                            String cnpj = leitor.nextLine();
                            System.out.println("Digite o nome do representante do cliente:");
                            String nomeRepresentante = leitor.nextLine();
                            Cliente cliente = new PessoaJuridica(nome, telefone, endereco, cnpj, nomeRepresentante);
                            locadoraVeiculos.cadastrarCliente(cliente);
                            break;
                        }
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;
                case 3:
                    
                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(opcao != 0);
    }
}