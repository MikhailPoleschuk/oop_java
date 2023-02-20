import units.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cbm cbm = new Cbm(GetNames());
        Monk monk = new Monk(GetNames());
        Priest priest=new Priest(GetNames());
        Robber robber=new Robber(GetNames());
        Rustic rustic=new Rustic(GetNames());
        Sniper sniper=new Sniper(GetNames());
        Spearman spearman=new Spearman(GetNames());

        System.out.println(cbm.GetInfo());
        System.out.println(monk.GetInfo());


    }

    private static String GetNames() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }
}
