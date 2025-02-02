package torsdagV2;

public class Frog extends Animal {


    Frog(String name,int age){
        super(name,age);
    }


        @Override // wenn zum beispiel das tier einen anderen eigenschaft hat als in "Animal: sleep"
        //schreibt man override
    public void behavior(){
        System.out.println("jump");
    }
}
