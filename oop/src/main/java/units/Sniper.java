package units;

public class Sniper extends Arta {
    static int id_Sniper;
    int id;
    public Sniper(String name) {
        super(name);
        id_Sniper++;
        this.id=id_Sniper;
    }

    @Override
    public void Step() {

    }

    @Override
    public String GetInfo() {

        String str = name + String.valueOf(id) + " " + " Я снайпер!";
        return str;
    }
}
