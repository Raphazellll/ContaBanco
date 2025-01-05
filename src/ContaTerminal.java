import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criando um Scanner para receber dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando e armazenando os dados da conta
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número da conta

        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final formatada
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                        + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        // Encerrando o Scanner
        scanner.close();
    }
}
