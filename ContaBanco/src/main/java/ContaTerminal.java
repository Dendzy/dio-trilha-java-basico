import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia,nomeDoCliente;
        double saldo;

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        nomeDoCliente = input.nextLine();

        System.out.println("Digite o número da Agência: ");
        agencia = input.nextLine();

        System.out.println("Digite o número da Conta: ");
        numeroConta = input.nextInt();

        System.out.println("Digite o saldo: ");
        saldo = input.nextDouble();

        System.out.println("\"Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está" +
                " disponível para saque.\"");
    }
}
