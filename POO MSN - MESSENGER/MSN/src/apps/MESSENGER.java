package apps;
public class MESSENGER  extends ServicoMensagemInstantanea{

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem");
    }

    protected void validarConexaoInternet() {  
        System.out.println("Validando conexão com a internet");
      }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
}
