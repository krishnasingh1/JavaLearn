public class ThreadConcurrency extends Thread {
     public static int amount=0;

    public static void main(String[] args) {

        ThreadConcurrency thread = new ThreadConcurrency();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);


    }

    public void run() {

        amount++;
    }
}
