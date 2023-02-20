import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Cbm cbm = new Cbm(GetNames());
//        Monk monk = new Monk(GetNames());
//        Priest priest = new Priest(GetNames());
//        Robber robber = new Robber(GetNames());
//        Rustic rustic = new Rustic(GetNames());
//        Sniper sniper = new Sniper(GetNames());
//        Spearman spearman = new Spearman(GetNames());

        ArrayList<Person> units = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            int unit_types=rnd.nextInt(7);
            if (unit_types == 0) {
                units.add(new Cbm(GetNames()));
            } else if (unit_types == 1) {
                units.add(new Monk(GetNames()));
            } else if (unit_types == 2) {
                units.add(new Priest(GetNames()));
            } else if (unit_types == 3) {
                units.add(new Robber(GetNames()));
            } else if (unit_types == 4) {
                units.add(new Rustic(GetNames()));
            } else if (unit_types == 5) {
                units.add(new Sniper(GetNames()));
            } else if (unit_types == 6) {
                units.add(new Spearman(GetNames()));
            }
        }
        for (int i = 0; i < units.size(); i++) {
            System.out.println(units.get(i).GetInfo());
        }


    }

    private static String GetNames() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }
}
