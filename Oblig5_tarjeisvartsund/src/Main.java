import models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hus hus = new Hus(10,10, "h", 20,20,5,3,"tre",4
        );
        System.out.println(hus);

        Butikk butikk = new Butikk(10,10,"h", 20,20,5,3,"stein","mat",10);
        System.out.println(butikk);

        Skole skole = new Skole(10,10,"h", 20,20,5,3,"stein","Barneskole", 10);
        System.out.println(skole);

        Park park = new Park(10,10,"j","lekeplass", "dfggdf");
        System.out.println(park);

        Hus olavsgate_19 = new Hus(10,10,"olavsgate 19",4,6,5,2,"tre",4);
        Hus olavsgate_20 = new Hus(10,10, "olavsgate 20",6, 4, 3, 1, "tre", 3);
        Butikk olavsgate_21 = new Butikk(30,30,"olavsgate 21",25,25,5,1,"stein",
                "mat", 10);
        Hus olavsgate_22 = new Hus(10,10,"olavsgate 22",4,4,3,1,"bettong",5);
        Hus olavsgate_23 = new Hus(15,15,"olavsgate 23",10,11,8,3,"tre",5);
        Skole olavsgate_24 = new Skole(40,60,"olavsgate 24", 30,50,8,2,"tre",
                "ungdomskole",300);
        Park olavsgate_25 = new Park(30,30,"olavsgate 25","lekeplass","olavsplass");

        ArrayList<Byggning> olavsgate = new ArrayList<>();
        olavsgate.add(olavsgate_19);
        olavsgate.add(olavsgate_20);
        olavsgate.add(olavsgate_21);
        olavsgate.add(olavsgate_22);
        olavsgate.add(olavsgate_23);
        olavsgate.add(olavsgate_24);

        Nabolag nabolag = new Nabolag(3186, olavsgate);




    }
}
