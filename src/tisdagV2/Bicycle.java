package tisdagV2;

public class Bicycle extends Vehicle {
    private int nbrOfGears;
    private int currentGear;

    public void nbrOfGears(int nbr){
        nbrOfGears = nbr;
        System.out.println("Bicycle has " + nbrOfGears+ " gears");
    }
    public void increaseSpeed(int force){
        if(nbrOfGears > 0) {
            speed += force*currentGear;
            if(nbrOfGears < currentGear){
                currentGear++;
            }
            System.out.println(" current gear is:"+currentGear);
        } else {
            System.out.println("Set number of gear");
        }
    }
}
