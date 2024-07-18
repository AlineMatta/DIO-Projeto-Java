import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CadastroCliente CadastroCliente = new CadastroCliente();

        Cliente cliente = CadastroCliente.cadastrarCliente();
        
        Conta cc = new ContaCorrente(); 
        cliente.setConta(cc);
        
        boolean sair = false;
        while (!sair) {
            int opcao = exibirMenu();
            switch (opcao) {
                case 1:
                    sacar(cliente);
                    break;
                case 2:
                    depositar(cliente);
                    break;
                case 3:
                    transferir(cliente);
                    break;
                case 4:
                    sair = true;
                    System.out.println("Deslogando do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }
        CadastroCliente.fecharScanner();
    }

    private static int exibirMenu() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Menu de Operações ===");
        System.out.println("1. Sacar");
        System.out.println("2. Depositar");
        System.out.println("3. Transferir");
        int opcao = scanner.nextInt();
        return opcao;
    }

    private static void sacar(Cliente cliente) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de saque: ");
        double valor = scanner.nextDouble();

        cliente.getConta().sacar(valor);

        System.out.println("Saque realizado com sucesso!");
    }

    private static void depositar(Cliente cliente) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a ser depositado: ");
        double valor = scanner.nextDouble();

        cliente.getConta().depositar(valor);

        System.out.println("Depósito realizado com sucesso!");
    }


    private static void transferir(Cliente cliente) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor pa ser transferido: ");
        double valor = scanner.nextDouble();

        Conta contaDestino = new ContaPoupanca();

        cliente.getConta().transferir(valor, contaDestino);
        
        System.out.println("Transferência realizada com sucesso!");
    }
}
