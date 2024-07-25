import dio.gof.singleton.Singleton;
import facade.facade;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Teste {

    public static void main(String[] args) {
        Singleton singleton= Singleton.getInstancia();
        System.out.println(singleton);
        singleton = Singleton.getInstancia();
        System.out.println(singleton);

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();

        facade facade = new facade();
        facade.migrarCliente("Aline", "04300000");
    }

}
