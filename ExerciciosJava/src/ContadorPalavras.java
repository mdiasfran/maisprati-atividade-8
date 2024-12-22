import java.util.Scanner;

public class ContadorPalavras {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine().trim();

        if (frase.isEmpty()) {
            System.out.println("A frase está vazia!");
            return;
        }

        String[] palavras = frase.split("\\s+");
        int numeroPalavras = palavras.length;

        System.out.println("Número de palavras na frase: " + numeroPalavras);
        System.out.println("As palavras são:");
        for (String palavra : palavras) {
            System.out.println("- " + palavra);
        }
    }
}