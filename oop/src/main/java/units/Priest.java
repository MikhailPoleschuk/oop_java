package units;

public class Priest extends Spirit {
    static int id_Priest;
    int id;
    public Priest(String name) {
        super(name);
        id_Priest++;
        this.id=id_Priest;
    }

    private int to_teleport(){
        return 0;
    }
    private int to_deffens(){
        return 0;
    }

    @Override
    public void Step() {

    }

    @Override
    public String GetInfo() {

        String str = name + String.valueOf(id) + " " + " Я колдун!";
        return str;
    }
}
