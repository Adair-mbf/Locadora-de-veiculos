package Carro;
public class CarroSuv extends Carro{
    private double tamanhoPortaMalas;
    private String tipoTracao;
    private String tipoCombustivel;
    
    public CarroSuv(String marca, String modelo, String placa, String ano, double valorLocacao,double tamanhoPortaMalas, String tipoTracao, String tipoCombustivel) {
        super(marca, modelo, placa, ano, valorLocacao);
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.tipoTracao = tipoTracao;
        this.tipoCombustivel = tipoCombustivel;
    }
}
