import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

/**
 * Created by benjamindrake on 10/26/15.
 */
public class AnonymousFunctionExample {
    public static void main(String[] args) {
        //run code from separate method
        sayHello();

        //run code from anonymous class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from an anonymous class!");
            }
        };
        r1.run();

        // Run code from anonymous function
        Runnable r2 = () -> {
            System.out.println("Hello from an anonymous function!");
        };
        r2.run();
    }
    static void sayHello(){
        System.out.println("Hello from a separate method!");
    }
}
