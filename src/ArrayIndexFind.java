import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayIndexFind {

    // find the indux using binarySearch

    public static int findIndex(int arr[], int t)
    {

        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }

    public static void main(String[] args){

        int[] array = {2,5,8,9,10};

        System.out.println("array length : "+array.length);
        System.out.println("Index position of 5 is:"
        +findIndex(array, 5));
        System.out.println("array");

        // all the the positions of total elemets
        for (int i=0; i<=array.length; i++) {
             System.out.println("index position of element of  "+array[i] + "  is : "
                     +findIndex(array,array[i])) ;

         }
    }
}
