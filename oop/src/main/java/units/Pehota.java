package units;

public abstract class Pehota extends Person {
    protected int deff,dem;
    protected int helth;
    protected int exp;
    protected int speed;

    public Pehota(String name) {
        super(name);
        this.deff = 20;
        this.dem = 10;
        this.helth = 100;
        this.exp = 1;
        this.speed = 5;
    }

    public int to_attak(){
        return 0;
    }
    public int get_damage(){
        return 0;
    }

}