package tisdagV2;

public class Race {
    public static void main(String[] args) {
        Car myCar=new Car();

        myCar.increaseSpeed(100);

        myCar.showSpeed();

        Bicycle myBicycle=new Bicycle();
        myBicycle.nbrOfGears(6);

        myBicycle.increaseSpeed(110);
        myBicycle.showSpeed();

    }
}
