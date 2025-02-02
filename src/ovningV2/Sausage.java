package ovningV2;

public class Sausage extends Meal{


    public Sausage(){
        price= 15;
    }
    public void serve(){
        System.out.println("It is served in a bun!");
    }
    public void kindOfFood(){
        System.out.println();
        System.out.println("Sausage");
    }
    public void addKetchup(){
        System.out.println("Add ketchup");
        price+=2;;
    }

}
