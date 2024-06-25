import java.text.DecimalFormat;

public class Teste {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0.00");

        //Declaração dos objetos moedas;
        Moeda umCentavo = new Moeda(0.01,"Um centavo");
        Moeda cincoCentavos = new Moeda(0.05,"Cinco Centavos");
        Moeda dezCentavos = new Moeda(0.10,"Dez Centavos");
        Moeda vinteEcincoCentavos = new Moeda(0.25,"Vinte e cinco Centavos");
        Moeda cinquentaCentavos = new Moeda(0.50,"Cinquenta Centavos");
        Moeda umReal = new Moeda(1,"Um Real");

        Cofrinho cofrinho = new Cofrinho();

        System.out.println("--> Estado do cofre...");
        cofrinho.imprimiTotal();

        System.out.println("-->Adicionado R$ " + umCentavo.getValor() + " no cofrinho");
        cofrinho.adiocnarMoeda(umCentavo);
        cofrinho.imprimiTotal();

        System.out.println("-->Adicionado R$ " + cincoCentavos.getValor() + " no cofrinho");
        cofrinho.adiocnarMoeda(cincoCentavos);
        cofrinho.imprimiTotal();

        System.out.println("-->Adicionado R$ " + format.format(dezCentavos.getValor()) + " no cofrinho");
        cofrinho.adiocnarMoeda(dezCentavos);
        cofrinho.imprimiTotal();

        System.out.println("-->Adicionado R$ " + vinteEcincoCentavos.getValor() + " no cofrinho");
        cofrinho.adiocnarMoeda(vinteEcincoCentavos);
        cofrinho.imprimiTotal();

        System.out.println("-->Adicionado R$ " + format.format(cinquentaCentavos.getValor()) + " no cofrinho");
        cofrinho.adiocnarMoeda(cinquentaCentavos);
        cofrinho.imprimiTotal();

        System.out.println("-->Adicionado R$ " + umReal.getValor() + " no cofrinho");
        cofrinho.adiocnarMoeda(umReal);
        cofrinho.imprimiTotal();

        System.out.println("-->Removendo R$ " + umReal.getValor() + " no cofrinho");
        cofrinho.exluirMoeda(umReal);
        cofrinho.imprimiTotal();

        System.out.println("-->Removendo R$ " + format.format(cinquentaCentavos.getValor()) + " no cofrinho");
        cofrinho.exluirMoeda(cinquentaCentavos);
        cofrinho.imprimiTotal();

        System.out.println("-->Removendo R$ " + umReal.getValor() + " no cofrinho");
        cofrinho.exluirMoeda(umReal);
        cofrinho.imprimiTotal();





    }
}
