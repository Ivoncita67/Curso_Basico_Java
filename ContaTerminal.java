import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura dos dados do terminal
        Scanner scanner = new Scanner(System.in);
        
        // Recebendo os dados via terminal
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        
        // Consumir a quebra de linha após a leitura do int
        scanner.nextLine();
        
        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();
        
        // Fechando o objeto Scanner
        scanner.close();
        
        // Exibindo as informações recebidas
        System.out.println("\nConta criada com sucesso!");
        System.out.println("Número da conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
    }
}