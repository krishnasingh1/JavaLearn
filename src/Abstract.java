import java.time.Year;

public abstract class Abstract {

    public String fname = "Krishna";
    public int age = 23;
    public abstract void study();  //abstract method

}

// Sub Class Inherited From Abstract

class Student extends Abstract {

    public int GraduationYear = 2021;
    @Override
    public void study() {

        // The Body Of abstract Method Provided Here
        System.out.println("Studying All Day long ");

    }
}
