import java.util.Scanner;

public class Palindromo {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String palavraProcessada = palavra.replaceAll("\\s+", "").toLowerCase();
        String palavraInvertida = new StringBuilder(palavraProcessada).reverse().toString();

        if (palavraProcessada.equals(palavraInvertida)) {
            System.out.println("\"" + palavra + "\" é um palíndromo!");
        } else {
            System.out.println("\"" + palavra + "\" não é um palíndromo.");
        }
    }
}