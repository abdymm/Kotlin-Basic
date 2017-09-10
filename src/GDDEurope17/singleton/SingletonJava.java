package GDDEurope17.singleton;

public class SingletonJava {
    private static final SingletonJava instance = new SingletonJava();

    public SingletonJava() {

    }

    public String property;

    public static SingletonJava getInstance() {
        //property lalala
        return instance;
    }
}
