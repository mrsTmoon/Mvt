package torsdagV2;

public class Main {
    public static void main(String[] args) {
        Frog frog=new Frog("Boll",3);
        frog.writeName();
        frog.behavior();
        Dog dog=new Dog("Thor",5);
        dog.writeName();
        dog.behavior();


    }
}
