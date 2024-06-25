public abstract class CFuncionario {

    private String nome;
    private String cpf;


    public CFuncionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Object getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract double calculaRendimentos();

    public abstract void imprimiInfo();

}