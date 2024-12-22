import java.util.Scanner;

public class Fibonacci {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos números da sequência de Fibonacci você quer ver: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, digite um número positivo.");
            return;
        }

        long[] fibonacci = new long[n];
        fibonacci[0] = 0;

        if (n > 1) {
            fibonacci[1] = 1;

            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
        }

        System.out.println("Sequência de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println();
    }
}