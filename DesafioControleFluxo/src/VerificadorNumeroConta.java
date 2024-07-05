import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta bancária:");
        String numeroConta = scanner.nextLine();
        try {
            verificarNumeroConta(numeroConta);
            System.out.println("Número de conta válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Número de conta inválido.");
        }finally{
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() < 8) {
            throw new IllegalArgumentException("Número de conta deve ter exatamente 8 dígitos.");
        }
        
    }
    public static class IllegalArgumentException extends RuntimeException {
        public IllegalArgumentException(String message) {
            super(message);
        }
}
}