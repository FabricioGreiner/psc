import java.text.DecimalFormat;

public class Conta {
    private String numero;
    private String nomeTitular;
    private double saldo = 0;

    public Conta(String numero, String nomeTitular, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositarDinheiro(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor minímo para depósito não atingido");
        }
    }

    public void sacarDinheiro(double valor) {
       this.saldo -= valor;
    }
    public String imprimiInfo(){
        DecimalFormat format = new DecimalFormat("00.00");
        return "{Titular = " + this.nomeTitular + ", Saldo = " + format.format(this.saldo) + "}";
    }
}

