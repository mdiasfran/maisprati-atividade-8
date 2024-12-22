import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    Calculadora.executar();
                    break;
                case 2:
                    Palindromo.executar();
                    break;
                case 3:
                    Fibonacci.executar();
                    break;
                case 4:
                    NumeroInvertido.executar();
                    break;
                case 5:
                    Anagrama.executar();
                    break;
                case 6:
                    JogoAdivinhacao.executar();
                    break;
                case 7:
                    ContadorPalavras.executar();
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
        System.out.println("Programa finalizado!");
    }

    private static void exibirMenu() {
        System.out.println("\n=== MENU DE EXERCÍCIOS ===");
        System.out.println("1. Calculadora");
        System.out.println("2. Verificador de Palíndromo");
        System.out.println("3. Sequência de Fibonacci");
        System.out.println("4. Inverter Número");
        System.out.println("5. Verificador de Anagramas");
        System.out.println("6. Jogo de Adivinhação");
        System.out.println("7. Contador de Palavras");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
}
