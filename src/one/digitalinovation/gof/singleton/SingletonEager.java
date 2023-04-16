package one.digitalinovation.gof.singleton;

/**
 * Singleton "apressado".
 *
 * @autho FabioJesus188
 */
public class SingletonEager {

    private static SingletonEager instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonEager getInstancia()
        return instancia;
    }
}
