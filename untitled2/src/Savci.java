public class Savci extends Zvire {

public int pocetDniKojeni;

    public Savci(){
        super();
        pocetDniKojeni=0;
    }

    public Savci (char oznaceni, String jmeno, int pocetDniKojeni ) {
      super (oznaceni, jmeno);
      this.pocetDniKojeni = pocetDniKojeni;
    }
    public Savci(int vek, float zaludek, boolean zije, char oznaceni, String jmeno,int pocetDniKojeni){
        super (vek, zaludek, zije, oznaceni, jmeno);
        this.pocetDniKojeni = pocetDniKojeni;

    }
    public void pojmenuj(){
        java.util.Scanner vstup = new java.util.Scanner(System.in);
        System.out.println("Zadej nove jmeno pro zvire " + this.jmeno + " ze tridy Savec:");
        this.jmeno = vstup.nextLine();
    }
    public void informuj(){
        System.out.println("Jmeno zvirete je " + this.jmeno + " a oznaceni je " + this.oznaceni + " a zije " + this.zije +  " a vek je " +  this.vek  + " a zaludek je " + this.zaludek + "a pocet dni kojeni je " + this.pocetDniKojeni);
    }
}
