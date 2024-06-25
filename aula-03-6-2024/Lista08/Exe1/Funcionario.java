import java.text.DecimalFormat;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;


    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
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

    public double getSalario() {
        return salario;
    }

    public String imprimirInfo() {
        DecimalFormat format = new DecimalFormat("00.0");
        return String.format(
                "-Nome: " + this.nome +
                "\n-CPF: " + this.cpf +
                "\n-Salário: " + format.format(this.salario));
    }
}