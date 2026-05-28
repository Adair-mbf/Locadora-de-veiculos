package Cliente;

public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, String telefone, String endereco, String cpf) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
    }
}
