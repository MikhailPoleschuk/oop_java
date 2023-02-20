package units;

public class Spearman extends Pehota {
    static int id_Pehota;
    int id;

    public Spearman(String name) {
        super(name);
        id_Pehota++;
        this.id = id;
    }

    @Override
    public void Step() {

    }

    @Override
    public String GetInfo() {

        String str = name + String.valueOf(id) + " " + " Я копейщик!";
        return str;
    }
}
