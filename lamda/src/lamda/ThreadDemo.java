package lamda;

/**
 * Created by KENT on 2018-06-09.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("trandition is ok");
            }
        }).start();
        // jdk8
        new Thread(() -> System.out.println("lamda is ok")).start();
    }
}
