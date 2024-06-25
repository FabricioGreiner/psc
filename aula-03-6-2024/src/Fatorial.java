import java.util.Scanner;

public class Fatorial {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero;
            char continuar;

            do {
                System.out.print("Digite um número para calcular o fatorial: ");
                numero = scanner.nextInt();

                // Calcula o fatorial
                long fatorial = 1;
                for (int i = 1; i <= numero; i++) {
                    fatorial *= i;
                }

                System.out.printf("O fatorial de %d é: %d\n",numero,fatorial);

                // Pergunta se o usuário deseja continuar
                System.out.print("Deseja calcular outro fatorial? (s/n): ");
                continuar = scanner.next().charAt(0);

            } while (continuar == 's' || continuar == 'S');

            scanner.close();
        }
    }

