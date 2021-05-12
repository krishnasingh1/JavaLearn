import static java.lang.Thread.sleep;

public class ThreadRunnableInterface implements Runnable {

    public static void main(String[] args) {
        ThreadRunnableInterface obj = new ThreadRunnableInterface();
        Thread thread = new Thread(obj);
        thread.start();
       System.out.println("The code is out side the Threads");

    }
    @Override
    public void run() {

        try {
            sleep(1000);
            System.out.println("The code is in side the Threads");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
