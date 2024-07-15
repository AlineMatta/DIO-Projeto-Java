package iphone;

public class telefone implements aparelhoTelefonico {

    @Override
    public void ligar(){
        System.out.println("Ligando...");
    }

    @Override
    public void atender(){
        System.out.println("Atendendo...");
    }

    @Override
    public void correioVoz(){
        System.out.println("Você ligou para...");
    }
    
}
