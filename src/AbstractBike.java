public abstract class AbstractBike {

    abstract void bike();
}

class Honda extends AbstractBike {

    @Override
    void bike() {

        System.out.println("Bike is Running");
    }
}


