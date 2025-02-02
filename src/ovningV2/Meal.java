package ovningV2;

public class Meal {
    public int price;
    public void order(){
        System.out.println("Thanks for your order!");
    }
    public void serve(){} //override
    public void kindOfFood(){}

    public int getPrice() {
        return price;
    }
}
