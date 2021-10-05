public class ThreadUseisAliveConcurrency extends Thread {
    public static int amount=0;

    public static void main(String[] args) {

        ThreadUseisAliveConcurrency thread = new ThreadUseisAliveConcurrency();

        thread.start();

        //Wait for the thread to finish

        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("main : " + amount);
        amount++;
        System.out.println("main : " + amount);
    }

    public void run() {

        amount++;
    }
}
