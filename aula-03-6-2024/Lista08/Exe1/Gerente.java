import java.text.DecimalFormat;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, String cpf, double salario, String departamento) {
        super(nome, cpf, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return super.getSalario();
    }

    public String imprimirInfo() {
        DecimalFormat format = new DecimalFormat("0.00");
        double salario = super.getSalario() + ((super.getSalario() * 20) / 100);

        return String.format(this.departamento +
                "\n-Nome: " + super.getNome() +
                        "\n-CPF: " + super.getCpf() +
                        "\n-Salário: " + format.format(salario));
    }
}

