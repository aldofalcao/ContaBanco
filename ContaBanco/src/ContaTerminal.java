import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Double saldo = 0.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da sua conta e aperte enter: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o número da sua agencia com o dígito e aperte enter: ");
        String agencia = scanner.next();

        System.out.print("Digite seu nome e aperte enter: ");
        String nomeCliente = scanner.next();
        scanner.close();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para movimentação.");
    }
}
