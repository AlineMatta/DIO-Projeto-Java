import java.util.Scanner;

public class CadastroCliente {

    private Scanner scanner;

    public CadastroCliente() {
        this.scanner = new Scanner(System.in);
    }

    public Cliente cadastrarCliente() {
        System.out.println("Cadastro de Cliente:");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        return new Cliente(nome, senha);
    }

    public void fecharScanner() {
        scanner.close();
    }
}

