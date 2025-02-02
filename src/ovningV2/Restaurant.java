package ovningV2;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
       /* Sausage s=new Sausage();
        s.order();
        s.serve();

        Meal m= new Sausage();
        m.order();
        m.serve();*/
        Scanner scan= new Scanner(System.in);

        Meal[] meals= new Meal[2];


        for (int i=0;i<meals.length;i++) {
            System.out.println("Whats your order: ");
            String food = scan.nextLine();
            if (food.equals("Ice Cream")){
                meals[i] = new IceCream();
                System.out.println(" Do you want sprinkles? Y/N");
                if(scan.nextLine().equals("Y")){
                    ((IceCream) meals[i]).addSprinkles();
                }
        } else
        {
            meals[i] = new Sausage();
            System.out.println(" Do you want ketchup? Y/N");
            if(scan.nextLine().equals("Y")){
                ((Sausage) meals[i]).addKetchup();
            }
        }
        }


       /* Meal[] meals= new Meal[5];
        meals[0]=new Sausage();
        meals[1]=new IceCream();
        meals[2]=new Sausage();
        meals[3]=new IceCream();
        meals[4]=new Sausage();*/


        for (int i=0;i<meals.length;i++){
            meals[i].kindOfFood();
            meals[i].serve();
        }

        int totalPrice=0;
        for (int i=0;i<meals.length;i++){
            totalPrice+= meals[i].getPrice();
        }
        System.out.println("Total price is: "+totalPrice);
    }
}
