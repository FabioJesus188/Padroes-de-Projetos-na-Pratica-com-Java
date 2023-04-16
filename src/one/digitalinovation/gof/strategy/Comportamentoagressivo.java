package one.digitalinovation.gof.strategy;

public class Comportamentoagressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }

}
