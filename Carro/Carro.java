package Carro;
public abstract class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private String ano;
    private double valorLocacao;
    public Carro(String marca, String modelo, String placa, String ano, double valorLocacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorLocacao = valorLocacao;
    }
}
