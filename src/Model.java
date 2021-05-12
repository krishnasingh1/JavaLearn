public class Model {

    Integer pclass, percenteg;
    String name;

    public Model(Integer pclass, Integer percenteg, String name) {
        this.pclass = pclass;
        this.percenteg = percenteg;
        this.name = name;
    }

    public String getName(){ return name;}
    public Integer getPclass() { return pclass;}
    public Integer getPercenteg() {
        return percenteg;
    }


    public static void main(String [] arg) {


    }


}


