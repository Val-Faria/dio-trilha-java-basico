import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner dadosUsuario = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência e dígito: ");
        String agencia = dadosUsuario.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = dadosUsuario.nextInt();

        dadosUsuario.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = dadosUsuario.nextLine();

        System.out.println("Por favor, digite o saldo:");
        String saldoTexto = dadosUsuario.next().replace(",", ".");
        double saldo = Double.parseDouble(saldoTexto);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        dadosUsuario.close();
    }
}
