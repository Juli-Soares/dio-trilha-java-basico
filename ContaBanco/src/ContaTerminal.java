import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("-------------CONTA BANCÁRIA------------");
        System.out.println();
        System.out.println("Digite o númeroda conta: (1234)");
        numero = scanner.nextInt();

        System.out.println("Digite o número da agência: (123-8)");
        agencia = scanner.next();

        System.out.println("Informe o nome do cliente: ");
        nomeCliente = scanner.next();
        scanner.nextLine();

        System.out.println("Informe o saldo atual: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$ " + saldo + ".");

        scanner.close();
    }
    

}
