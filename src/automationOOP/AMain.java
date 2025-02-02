package automationOOP;

public class AMain {
    public static void main(String[] args) {
        AClass aclass=new AClass();// skappat new object
        //System.out.println(aclass.text);
        System.out.println(aclass.textPublic);
        System.out.println(aclass.getTextPrivate());
        aclass.setTextPrivate("This is a new private text");
        System.out.println(aclass.getTextPrivate());
    }
}
