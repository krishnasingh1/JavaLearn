import java.util.ArrayList;

public class ArrayListSort {

    public static void main(String[] args) {

        Integer[] list = {2,5,9,7,10};
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(2);
        myNumbers.add(5);
        myNumbers.add(9);
        myNumbers.add(7);
        myNumbers.add(10);

        System.out.println("old Array List");
        for (int i : myNumbers) {
            System.out.println(i);
        }

        for(int i=0; i<myNumbers.size(); i++){
            for(int j=myNumbers.size()-1; j>i;j--){
                if(myNumbers.get(j) < myNumbers.get(i)){
                    int temp= myNumbers.get(i);
                    myNumbers.set(i ,myNumbers.get(j));
                    myNumbers.set(j,temp);
                }
            }
        }

        System.out.println("new Arry");
        for(int i=0; i< myNumbers.size(); i++)
        {
            System.out.println(myNumbers.get(i) + "");
        }


    }
}

