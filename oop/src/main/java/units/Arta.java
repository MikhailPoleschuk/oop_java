package units;

public abstract class Arta extends Person {
    protected int deff,dem;
    protected int distans,cartridges;
    protected int helth;
    protected int exp;
    protected int speed;

    public Arta(String name) {
        super(name);
        this.deff = 10;
        this.dem = 5;
        this.distans = 20;
        this.cartridges = 5;
        this.helth = 100;
        this.exp = 1;
        this.speed = 5;
    }

    public Integer to_attak(){
        return 0;
    }
    public Integer get_damage(){
        return 0;
    }

}