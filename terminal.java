import java.util.Scanner;

public class terminal {
    public static void main(String[] args) {
        // Criando o Scanner para receber entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Leitura de Dados
        System.out.println("Bem-vindo ao Banco Javinha!");
        System.out.println("Por favor, preencha os dados a seguir:");
        System.out.println("Digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        System.out.println("Digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        // Mensagem final de confirmação
        System.out.println("\nOlá " + nomeCliente + ", você criou uma conta no banco Javinha, seguem seus dados, sua agência é "
            + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
