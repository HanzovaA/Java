public class Main {

    public static void main(String[] args) {
        System.out.println("Moje ZOO");

        Savci opice = new Savci ();
        Savci  pes = new Savci (0,0,true,'A', "Alik",54);
        Savci  kocka = new Savci ('B', "Micka",42);
        Savci  lev = new Savci ('C', "Caesar",25);
        Savci  medved = new Savci ('D', "Brumlik",36);

        Ptaci  orel = new Ptaci ('D', "Karel",36);

        Obojzivelnici zaba = new Obojzivelnici ('D', "Brumlik",36);

        Zvire.pocet();
        opice.informuj();
        kocka.informuj();
        pes.informuj();
        lev.informuj();
        medved.informuj();
        orel.informuj();
        //---------------------1.den--------------
        opice.pojmenuj();
        opice.jez();
        kocka.jez();
        pes.jez();
        lev.jez();
        medved.jez();
        orel.jez();


        Zvire.pocet();
        opice.informuj();
        kocka.informuj();
        pes.informuj();
        lev.informuj();
        medved.informuj();
        orel.informuj();
        //---------------------2.den-----------------
        opice.vymesuj();
        kocka.vymesuj();
        pes.vymesuj();
        lev.vymesuj();
        medved.vymesuj();
        orel.vymesuj();

        Zvire.pocet();
        opice.informuj();
        kocka.informuj();
        pes.informuj();
        lev.informuj();
        medved.informuj()
        orel.informuj();
    }
}