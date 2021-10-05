import java.text.SimpleDateFormat;
import java.util.Calendar;

import static java.lang.Thread.sleep;

public class CurrentTimeUpdate extends Thread{

      String x;


        public void run(){

            try {
                sleep(1000);
                Calendar calendar= Calendar.getInstance();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
                String currenttime = simpleDateFormat.format(calendar.getTime());


            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    public static void main(String[] args) {

        Thread t1 = new Thread();
        t1.start();
        System.out.println();
    }
}


