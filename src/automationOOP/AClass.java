package automationOOP;

public class AClass {
    //String text; // Attribut
    private String textPrivate;
    public String textPublic;



    //Konstruktor
    public AClass(){
        //this.text="Detta är en text"; // this visa att nånting tillhöre till classen
        //this.textPrivate="this is a private text";
        this.setTextPrivate("This class is private");
        this.textPublic="This text is public";

    }
    public String getTextPrivate() {
        return textPrivate;
    }

    public void setTextPrivate(String textPrivate) {
        if (!textPrivate.contains("ö"))
        this.textPrivate = textPrivate;
    }
}
