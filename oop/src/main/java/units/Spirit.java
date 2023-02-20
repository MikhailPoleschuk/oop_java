package units;

public abstract class Spirit extends Person {
    protected int mana;
    protected int helth;
    protected int exp;
    protected int speed;

    public Spirit(String name) {
        super(name);
        this.mana= 1000;
        this.helth = 100;
        this.exp = 1;
        this.speed = 5;
    }
}
