package ContaBanco;

import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("Olá, bem-vindo(a) ao banco");
        System.out.println("==========================");

        // Lê tudo como texto, depois converte os números
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu saldo:R$");
        float saldo = Float.parseFloat(scanner.nextLine());

        // Mensagem final
        System.out.println();
        System.out.println(nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("\nSua agência é " + agencia + ", conta " + numeroConta +
                " e seu saldo R$ " + String.format("%.2f", saldo) + " já está disponível para saque.");

        scanner.close();
    }
}
