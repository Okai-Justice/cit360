

/**
 *
 * @author cit360 Justicejil
 */
public class RunnableTest implements Runnable {

    public void run() {
        System.out.println("Thread Response");
    }
    public static void main(String args[]) {
        (new Thread(new RunnableTest())).start();
    }
}