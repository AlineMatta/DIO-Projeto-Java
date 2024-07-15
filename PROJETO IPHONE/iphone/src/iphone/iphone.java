package iphone;

public class iphone implements reprodutorMusical, aparelhoTelefonico, navegadorInternet {


    @Override
    public void exibirPagina(){
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando página");
    }

    @Override
    public void ligar(){
        System.out.println("iphone: Ligando");
    }

    @Override
    public void atender(){
        System.out.println("iphone: Atendendo chamada");
    }

    @Override
    public void correioVoz(){
        System.out.println("iphone: Iniciando correio de voz");
    }

    @Override
    public void tocarMusica(){
        System.out.println("iphone: Tocando música");
    }

    @Override
        public void pausar(){
            System.out.println("iphone: Pausando música");
        }

    @Override
        public void mudarMusica(){
            System.out.println("iphone: Mudando de música");
        }
    }



