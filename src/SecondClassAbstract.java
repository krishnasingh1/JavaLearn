public class SecondClassAbstract {

    public static void main(String[] args){

        //create an obj. for student Class (which inherited attributes and methods from Abstract)
        Student myObj = new Student();

        System.out.println( "Name : "+myObj.fname);
        System.out.println("Age : "+myObj.age);
        System.out.println("Graduation Year :"+myObj.GraduationYear);
        myObj.study(); //call abstract Method
    }
}
