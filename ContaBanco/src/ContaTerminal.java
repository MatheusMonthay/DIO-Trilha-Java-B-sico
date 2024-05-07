
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agencia !");
        sc.nextLine();
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = sc.nextLine();

        System.out.println("Por davor, digite seu saldo!");
        double saldo = sc.nextDouble();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo R$:"+ saldo + " já está disponível para saque");

    }
}
