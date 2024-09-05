package banco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber dados via terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitar e capturar os dados do usuário
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();  // Lê o número da conta
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Por favor, digite o seu Nome: ");
        String nomeCliente = scanner.nextLine();  // Lê o nome do cliente

        System.out.println("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();  // Lê o saldo inicial

        // Exibir mensagem final usando concatenação de strings
        String mensagem = "Olá ".concat(nomeCliente)
            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .concat(agencia)
            .concat(", conta ")
            .concat(String.valueOf(numero))
            .concat(" e seu saldo ")
            .concat(String.format("%.2f", saldo))
            .concat(" já está disponível para saque.");

        System.out.println(mensagem);

        // Fechar o Scanner
        scanner.close();
    }
}
