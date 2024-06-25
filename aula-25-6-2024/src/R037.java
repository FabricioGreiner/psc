import java.util.Random;
import java.util.Scanner;

public class R037 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int resp = 1;
        int size =0;
        double valoresMedia =0;

        while(resp != 0){
            Random aleatorio = new Random();
            int random = aleatorio.nextInt(20);
            resp = read.nextInt();
            if(resp >0){
                System.out.println("Idade: " + random);
                valoresMedia += random;
                size++;
            }

        }
        System.out.println(STR."Foram digitadas \{size} idades\nMédia das idades: \{calculaMedia(valoresMedia, size)}");
    }

    public static double calculaMedia(double valorMedia,int size){
        return valorMedia / (size);
    }
}