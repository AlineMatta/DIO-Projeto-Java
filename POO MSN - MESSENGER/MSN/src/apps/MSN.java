package apps;
public class MSN extends ServicoMensagemInstantanea {

    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando mensagem");
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
}
