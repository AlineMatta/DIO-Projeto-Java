import java.util.Scanner;

public class Contador {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
    }
}

static void contar(int parametroUm, int parametroDois) throws Exception {
    if (parametroUm > parametroDois) {
        throw new Exception("O segundo parâmetro deve ser maior que o primeiro");
    }

    for (int i = parametroUm; i <= parametroDois; i++) {
        System.out.println("Imprimindo o número " + i);
    }
}
}