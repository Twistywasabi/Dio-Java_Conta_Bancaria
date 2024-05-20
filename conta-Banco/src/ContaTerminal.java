//Conhecer e importar a classe Scanner - OK
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: 
        // exibir as mensagens para nosso usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Obter pela classe scanner os valores digitados no terminal
        System.out.print("Digite o seu nome: ");
        String nomeCliente = scanner.next();
        System.out.print("Por favor, digite o número da Agência !: ");
        String agenciaCliente = scanner.next();
        System.out.print("Agora, digite o número da conta: ");
        int contaCliente = scanner.nextInt();
        // exibir as mensagens para nosso usuário
        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaCliente + ", conta " + contaCliente + " e seu saldo [Saldo] já está disponível para saque");
        
    }
}
