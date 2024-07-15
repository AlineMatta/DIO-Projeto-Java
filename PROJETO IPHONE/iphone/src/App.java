import iphone.Safari;
import iphone.iphone;
import iphone.pod;
import iphone.telefone;

public class App {
    public static void main(String [] args) throws Exception{
        pod pod = new pod();
        pod.tocarMusica();

        telefone telefone = new telefone();
        telefone.atender();

        Safari safari = new Safari();
        safari.exibirPagina();

        iphone iphone = new iphone();
        iphone.adicionarNovaAba();

    }
}
