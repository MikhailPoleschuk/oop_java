package units;

public class Monk extends Spirit {

    static int id_Monk;
    int id;

    public Monk(String name) {
        super(name);
        id_Monk++;
        this.id = id_Monk;
    }

    private int to_helth() {
        return 0;
    }

    private int to_faith() {
        return 0;
    }

    @Override
    public void Step() {

    }

    @Override
    public String GetInfo() {

        String str = name + String.valueOf(id) + " " + " Я монах!";
        return str;
    }
}
