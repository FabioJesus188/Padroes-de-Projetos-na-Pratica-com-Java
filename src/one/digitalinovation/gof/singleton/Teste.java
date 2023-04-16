package one.digitalinovation.gof.singleton;

import one.digitalinovation.gof.facade.Facade;
import one.digitalinovation.gof.strategy.Comportamento;
import one.digitalinovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinovation.gof.strategy.ComportamentoNormal;
import one.digitalinovation.gof.strategy.Comportamentoagressivo;

public class Teste {
    public static void main(String[] args) {

        // Testes relacionados ao Design Patter Singleton:

        SingletonEager lazy = SingletonEager.getInstance();
        System.out.println(eager);
        lazy = SingletonEager.getInstance();
        System.out.println(eager);

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new Comportamentoagressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo mover();
        robo mover();

        robo.setComportamento(defensivo);
        robo mover();

        robo.setComportamento(agressivo);
        robo mover();
        robo mover();
        robo mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Fábio", "08342100");


    }
}
