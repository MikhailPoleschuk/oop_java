package units;

public class Cbm extends Arta {
    static int id_Cbm;
    int id;

    public Cbm(String name) {
        super(name);
        id_Cbm++;
        this.id = id_Cbm;
    }


    @Override
    public void Step() {
    }

    @Override
    public String GetInfo() {
        String str = name + String.valueOf(id) + " " + " Я арбалетчик!";
        return str;
    }
}
