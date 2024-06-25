public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("442255","Fabricio",1000,500);
        System.out.println(conta1.imprimiInfo());
        conta1.depositarDinheiro(100);
        System.out.println(conta1.imprimiInfo());
        conta1.sacarDinheiro(1000);
        System.out.println(conta1.imprimiInfo());
        conta1.sacarDinheiro(100);
        System.out.println(conta1.imprimiInfo());
        conta1.sacarDinheiro(200);
        System.out.println(conta1.imprimiInfo());

    }
}