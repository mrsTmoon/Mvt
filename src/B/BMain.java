package B;

import automationOOP.AClass;

public class BMain {
    public static void main(String[] args) {
        AClass aclass=new AClass();
        System.out.println(aclass.textPublic);
    }
}

/*
private visas bara i classen
ej def: visas i classen och ej i package
public: visas för alla
(protected): visas i subclass och hela package

 */