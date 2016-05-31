/**
 * Created by sharov on 31.05.2016.
 */
public class Singleton {
    private static Singleton ourInstance = new Singleton();
    private int a;

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
