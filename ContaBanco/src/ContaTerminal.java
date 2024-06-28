import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
                System.out.print("Por favor, digite o número da Agência: ");
                String agencia = scanner.nextLine();
        
                System.out.print("Agora, digite o número da Conta: ");
                scanner.nextLine(); 
        
                System.out.print("Digite o nome do cliente: ");
                String nomeCliente = scanner.nextLine();
        
                System.out.print("Digite o saldo da conta: ");
                System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
                System.out.println("Sua agência é " + agencia + ", conta " + 1021 + " e seu saldo é R$" + 237.48 + ".");
                System.out.println("Seu saldo já está disponível para saque.");
        
                scanner.close();
            }
        }

