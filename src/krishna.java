    import java.util.*;

    public class krishna
{
    public static int add(int x,int y){
        int sum;
        sum=x+y;
        return sum;
    }

    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        addition D=new addition();
        int s;
        s= D.add();
        System.out.println("sum is :"+s);
    }
}


