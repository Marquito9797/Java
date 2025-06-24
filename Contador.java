import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = input.nextInt();

        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        // Verifica se o primeiro número é maior que o segundo
        if (num1 > num2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int total = num2 - num1;

        // Conta de 1 até total e imprime os números
        for (int i = 1; i <= total; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
