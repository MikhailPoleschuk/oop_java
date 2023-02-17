package units;

public class Rustic extends Person {
    static int id_rustic;
    int id;
    public Rustic(){
        id_rustic++;
        this.id =id_rustic;
        this.helth=100;
        this.exp=1;
        this.speed=5;

    }
    public void GetInfo(){
        System.out.println("rustic "+id+" helth="+this.helth+" exp="+ this.exp+" speed="+ this.speed);
    }
    public void GetDamage(){
        this.helth-=10;
    }
}


