package units;

public class Rustic extends Person {
    static int id_rustic;
    int id;

    public Rustic(String name) {
        super(name);
        id_rustic++;
        this.id = id_rustic;
    }

    @Override
    public void Step() {

    }

    @Override
    public String GetInfo() {

        String str = name + String.valueOf(id) + " " + " Я крестьянин!";
        return str;
    }
}


