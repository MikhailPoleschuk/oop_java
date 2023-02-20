package units;

public class Robber extends Pehota {
   public int to_steal(){
       return 0;
   }
    static int id_Robber;
    int id;

    public Robber(String name) {
        super(name);
        id_Robber++;
        this.id=id_Robber;
    }

    @Override
    public void Step() {

    }

    @Override
    public String GetInfo() {

        String str = name + String.valueOf(id) + " " + " Я вор!";
        return str;
    }
}
