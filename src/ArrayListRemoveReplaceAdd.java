import java.util.ArrayList;

public class ArrayListRemoveReplaceAdd {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

      Integer[] list1 = {10,20,30,40,50};
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);
     System.out.println("Before The Remove array element List");
     System.out.println(list);
        System.out.println("After The Remove array element List");
      list.remove(0);
      System.out.println(list);
        System.out.println("changed 0 index element array element List");
      list.set(0, 60);
      System.out.println(list);


    }
}
