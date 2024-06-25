import java.text.DecimalFormat;
import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    public void adiocnarMoeda(Moeda moeda) {
        this.moedas.add(moeda);
    }


    public void exluirMoeda(Moeda moeda) {
        if (this.calculaTotal() < moeda.getValor()) {
            System.out.println("Impossível excluir moeda. Valor insuficiente");
        } else {
            moedas.remove(moeda);
        }
    }

    public int getQuantidadeMoeda() {
        return moedas.size();
    }

    public Moeda getMoeda() {
        Moeda moeda = null;

        for (Moeda moedas : moedas) {
            moeda = moedas;
        }
        return moeda;
    }

    public double calculaTotal() {
        double soma = 0;
        for (Moeda moedas : moedas) {
            soma += moedas.getValor();
        }
        return soma;
    }

    public void imprimiTotal() {
        DecimalFormat format = new DecimalFormat("0.00");
        if (this.calculaTotal() == 0) {
            System.out.println("Cofre Vázio");
        } else {
            System.out.println("Total: " + format.format(calculaTotal()));
        }
    }
}
