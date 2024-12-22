import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(50) + 1;
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Jogo de Adivinhação - Tente adivinhar o número entre 1 e 50!");

        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas!");
                acertou = true;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número é maior!");
            } else {
                System.out.println("O número é menor!");
            }
        }
    }
}