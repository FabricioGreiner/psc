public class FuncionarioCLT extends CFuncionario {

    private double salarioMensal;

    public FuncionarioCLT(String nome, String cpf, double salarioMensal) {
        super(nome, cpf);
        this.salarioMensal = salarioMensal;
    }

    public void setSalario(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calculaRendimentos() {
        return this.salarioMensal;
    }

    @Override
    public void imprimiInfo() {
        System.out.printf("Dados Funcionário Horista:\n" +
                "- Nome: %s\n" +
                "- CPF: %s\n" +
                "- Rendimento mensal: R$%.2f\n\n", super.getNome(), super.getCpf(), calculaRendimentos());
    }
}


