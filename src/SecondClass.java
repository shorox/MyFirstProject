/**
 * Created by sharov on 31.05.2016.
 */
public class SecondClass {
    public void second(){
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.getA());
    }
}
