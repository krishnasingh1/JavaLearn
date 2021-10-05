import java.util.ArrayList;
import java.util.List;

public class HundredNumberPrintUsingList {
    public static void main(String args[]){
        //Creating List
        List<Integer>  myList = new ArrayList<Integer>();
        // add 1 to 100 Valuue on the list
        int number = 100;
        System.out.println("My List :");
        int count=0;
        for(int i=1; i<=number; i++){
            if (i%2==0){
               myList.add(0) ;
               count= count+1;
            }else {
                myList.add(i);
            }
        }
        System.out.println( myList);
        System.out.println("\n Count Zero :" +count );
        List<Integer> Change = new ArrayList<Integer>();
        //Remove Zero
        for (int j=1; j<=myList.size(); j++){
            if (j%2==0){
            }else {
               Change.add(j);
            }
        }System.out.println("\n"+Change);
    }
}
