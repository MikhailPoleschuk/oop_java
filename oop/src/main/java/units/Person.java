package units;

public abstract class  Person implements GameInterface{
    String name;
    public Person(String name) {
        this.name = name;
    }

    public void Step() {   }


    public String GetInfo() {
        String str = "такого человека быть не должно";
        return str;
    }


}
