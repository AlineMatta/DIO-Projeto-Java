import apps.MESSENGER;
import apps.MSN;
import apps.ServicoMensagemInstantanea;

public class Usuario {
    public static void main(String[] args) {
      ServicoMensagemInstantanea smi = null;

      String appEscolhido= "MESSENGER";

    if (appEscolhido.equals("msn")) 
        smi = new MSN();
    else if (appEscolhido.equals("MESSENGER")) 
        smi = new MESSENGER();
    
    smi.enviarMensagem();
    smi.receberMensagem();

        }
    }

