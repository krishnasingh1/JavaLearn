public class HundredNumber {

    public static void main(String args[]) {
        int number = 100;
        System.out.println(" Print List 1 To 100 : ");
        int count=0;
        for(int i=1; i<=number; i++) {
            if (i%2==0){
                System.out.print(" 0, ");
                count = count + 1;
            }else {
                System.out.print(i + ",");
            }
        }
        System.out.println(" \n\nCount zero :"+count );
        System.out.println( "\nprint 1 to 100 : ");
        for (int j=1; j<=number; j++){
            if (j%2==0){

            }else
                System.out.print(j+ ",");
        }
    }
}
