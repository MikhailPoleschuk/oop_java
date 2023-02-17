import units.*;

public class main {
    public static void main(String[] args) {
        Rustic rustic=new Rustic();
        Rustic rustic1=new Rustic();
        //тестируем методы над объектом и смотрим не трогает ли он другой экхемпляр класса
        rustic.GetInfo();
        rustic.GetDamage();
        rustic.GetInfo();
        rustic1.GetInfo();

        Robber robber=new Robber();
        Spearman spearman=new Spearman();
        Sniper sniper=new Sniper();

        // надо ли всегда указывать this?
        Cbm cbm=new Cbm();
        Cbm cbm1=new Cbm();
        cbm.GetInfo();
        cbm1.GetInfo();

        Monk monk=new Monk();
        Priest priest=new Priest();
        System.out.println("на код не ругается");

    }
}
