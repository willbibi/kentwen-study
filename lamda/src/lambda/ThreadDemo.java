package lambda;

/**
 * Created by KENT on 2018-06-09.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Object target = new Runnable() {
            @Override
            public void run() {
                System.out.println("trandition is ok");
            }
        };
        new Thread((Runnable) target).start();
        // jdk8
        Object target2 = (Runnable) () -> System.out.println("lambda is ok");
        new Thread((Runnable) target2).start();
    }
}
