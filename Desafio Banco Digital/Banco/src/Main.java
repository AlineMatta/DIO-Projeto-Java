import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CadastroCliente CadastroCliente = new CadastroCliente();

        Cliente cliente = CadastroCliente.cadastrarCliente();
        
        Conta cc = new ContaCorrente(); 
        cliente.setConta(cc);
        
        // Exibir o menu de operações enquanto o usuário não desejar deslogar
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

        // Fechar o scanner ao finalizar
        CadastroCliente.fecharScanner();
    }

    // Método para exibir o menu de operações
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

        // Acessar a conta do cliente e realizar o saque
        cliente.getConta().sacar(valor);

        System.out.println("Saque realizado com sucesso!");
    }

    // Método para realizar operação de depósito
    private static void depositar(Cliente cliente) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a ser depositado: ");
        double valor = scanner.nextDouble();

        // Acessar a conta do cliente e realizar o depósito
        cliente.getConta().depositar(valor);

        System.out.println("Depósito realizado com sucesso!");
    }

    // Método para realizar operação de transferência
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
