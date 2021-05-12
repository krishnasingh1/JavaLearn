import java.util.Scanner;

public class addition
{
    public static int add(){
        int sum,x = 0,y=0 ;
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
