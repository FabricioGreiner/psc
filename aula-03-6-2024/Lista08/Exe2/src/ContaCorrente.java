import java.text.DecimalFormat;

public class ContaCorrente extends Conta {
    private double limite = 500;

    public ContaCorrente(String numero, String nomeTitular, double saldo, double limite) {
        super(numero, nomeTitular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void sacarDinheiro(double valor) {
        if (valor > super.getSaldo()) {
            this.limite -= valor;
            super.sacarDinheiro(valor);
            if (this.limite <= 0) {
                System.out.println("Limite de conta estourado!");
            }
        } else {
            super.sacarDinheiro(valor);
        }
    }
    public String imprimiInfo() {
        DecimalFormat format = new DecimalFormat("00.00");

        return "{Titular = " + super.getNomeTitular() + ", Saldo = " + format.format(super.getSaldo()) + " (Limite " + format.format(this.limite) + ")}";
    }
}