import java.util.Scanner;

public class Calculadora {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operador inválido!");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.printf("Resultado: %.2f%n", resultado);
        }
    }
}