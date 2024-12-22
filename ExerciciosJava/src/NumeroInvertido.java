import java.util.Scanner;

public class NumeroInvertido {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int numeroInvertido = 0;
        int numeroOriginal = numero;

        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero = numero / 10;
        }

        System.out.println("Número original: " + numeroOriginal);
        System.out.println("Número invertido: " + numeroInvertido);
    }
}