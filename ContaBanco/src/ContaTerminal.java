import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o número da sua Conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite seu Nome Completo");
        scanner.nextLine();
        String nomeCompleto = scanner.nextLine();

        double saldo = 237.48;

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
