package Carro;

public class CarroLuxo extends Carro{
    private int qntdArbags;
    private double tamanhoPortaMalas;
    private boolean possuiGpsIntegrado;

    public CarroLuxo(String marca, String modelo, String placa, String ano, double valorLocacao, int qntdArbags, double tamanhoPortaMalas, boolean possuiGpsIntegrado) {
        super(marca, modelo, placa, ano, valorLocacao);
        this.qntdArbags = qntdArbags;
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.possuiGpsIntegrado = possuiGpsIntegrado;
    }
    @Override
    public void renovar(){
        if (this.qntdRenovacoes > 5) {
            
        }
        else{

        }
    }
}
