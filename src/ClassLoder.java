public class ClassLoder {

    public static void main(String[] args){
      Class c = ClassLoder.class;
      System.out.println(c.getClassLoader());
      System.out.println(String.class.getClassLoader());

    }
}
