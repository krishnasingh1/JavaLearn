public class Threads extends Thread {

    public static void main(String[] args) {

        Threads threads = new Threads();

        threads.start();
        System.out.println("The code is out Side the Threads");
    }

    public void run(){

        try {
            sleep(1000);
             System.out.println("the code is inside the thread");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
