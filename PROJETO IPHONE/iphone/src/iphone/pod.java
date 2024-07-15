package iphone;


public class pod implements reprodutorMusical {

    @Override
    public void tocarMusica(){
        System.out.println("Tocando música");
    }

    @Override
    public void pausar(){
        System.out.println("Música pausada");
    }

    @Override
    public void mudarMusica(){
        System.out.println("Mudando música");
    }
    
}
