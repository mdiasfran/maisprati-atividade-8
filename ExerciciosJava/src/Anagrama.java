import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");

        if (palavra1.length() != palavra2.length()) {
            System.out.println("As palavras não são anagramas.");
            return;
        }

        char[] chars1 = palavra1.toCharArray();
        char[] chars2 = palavra2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if (Arrays.equals(chars1, chars2)) {
            System.out.println("As palavras são anagramas!");
        } else {
            System.out.println("As palavras não são anagramas.");
        }
    }
}