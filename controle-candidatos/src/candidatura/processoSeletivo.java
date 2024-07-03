package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

public class processoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }
       
}
    static void entrandoEmContato (String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender ();
            continuarTentando = !atendeu;
            if (continuarTentando); 
                tentativasRealizadas++; 
            
            
        } while (continuarTentando && tentativasRealizadas <3);
            if (atendeu) 
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa") ;
             else 
                System.out.println("Não conseguimos contato com " + candidato + " , número máximo tentativas " + tentativasRealizadas + " realizada");
            
    }

    static boolean atender(){
        return ((RandomGenerator) new java.util.Random()).nextInt (3)==1;
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de numero " + (indice+1) + " é " + candidatos[indice]);
        }
    }


    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos [candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
        System.out.println("Ligar para o Candidato"); 
        }
        else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        }
        else {
            System.out.println("Aguardando demais candidatos");
        }
    }

}