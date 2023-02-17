package units;

public class Cbm extends Arta {
    static int id_cbm;
    int id;

    public Cbm() {
        id_cbm++;
        this.id = id_cbm;
        this.helth = 100;
        this.exp = 1;
        this.speed = 5;
        this.dem = 20;
        this.deff = 10;
        this.distans = 20;
        this.cartridges = 3;

    }

    public void GetInfo() {
        System.out.println("cbm " + id + " helth=" + this.helth + " exp=" + this.exp + " speed=" + this.speed +
                " dem=" + dem + " deff=" + deff + "distans=" + distans + " cartridges=" + cartridges);
    }

}
