
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        int Numero = 1021;
        String Agencia = "067-8";
        String NomeCliente = "Mario Andrade";
        double Saldo = 237.48;
        
        //TODO:Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuario
        //Obter pela classe Scanner os valores digitados no terminal

        System.out.println("Digite sua conta:");
        Numero = scanner.nextInt();

        System.out.println("Digite sua Agência:");
        Agencia = scanner.next();

        System.out.println("Digite seu nome completo:");
        NomeCliente = scanner.next();

        System.out.println("Digite o saldo inicial:");
        Saldo = scanner.nextDouble();

        //Exibir a mensagem da conta crida

        System.out.println("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque");
    }
}
