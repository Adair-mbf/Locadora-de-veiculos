package Carro;
public class CarroPopular extends Carro{
    private boolean possuiArCondicionado;

    public CarroPopular(String marca, String modelo, String placa, String ano, double valorLocacao, boolean possuiArCondicionado) {
        super(marca, modelo, placa, ano, valorLocacao);
        this.possuiArCondicionado = possuiArCondicionado;
    }
}
