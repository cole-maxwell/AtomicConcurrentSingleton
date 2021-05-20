package cs681;
import java.util.concurrent.atomic.AtomicReference;

public class ConcurrentSingleton {

    private ConcurrentSingleton() {};

    private static AtomicReference<ConcurrentSingleton>
        instance = new AtomicReference(new ConcurrentSingleton());

    // Factory method to create or return the singleton instance
    public static ConcurrentSingleton getInstance() {

        if(instance.get()==null) {
            instance = new AtomicReference(new ConcurrentSingleton());
        }
        return instance.get();
    }

    public static void main(String[] args) {
        System.out.println(ConcurrentSingleton.getInstance());
    }
}