import java.text.DecimalFormat;

public class FuncionarioHorista extends CFuncionario {

    private double salarioHora;
    private int horasTrabalhadas;

    public FuncionarioHorista(String nome, String cpf, double salarioHora, int horasTrabalhadas) {
        super(nome, cpf);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calculaRendimentos() {
        DecimalFormat format = new DecimalFormat("00.00");
        return this.horasTrabalhadas * this.salarioHora;
    }

    public void imprimiInfo() {
        System.out.printf("Dados Funcionário CLT:\n" +
                "- Nome: %s\n" +
                "- CPF: %s\n" +
                "- Rendimento mensal: R$%.2f", super.getNome(), super.getCpf(), calculaRendimentos());
    }
}
