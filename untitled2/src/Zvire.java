public abstract class Zvire {
    static int pocet = 0; //jednotky kus
    int vek; // jednotky den
    float zaludek; // jednotky kg
    boolean zije;
    char oznaceni;
    String jmeno;
    public Zvire(){
        vek = 0;
        zaludek = 0;
        zije = true;
        oznaceni = '0';
        jmeno = "Noname";
        pocet++;
    }
    public Zvire(char oznaceni, String jmeno) {
        vek = 0;
        zaludek = 0;
        zije = true;
        this.oznaceni = oznaceni ;
        this.jmeno = jmeno;
        pocet++;
    }
    public Zvire(int vek, float zaludek, boolean zije, char oznaceni, String jmeno) {
        this.vek = vek;
        this.zaludek = zaludek;
        this.zije = zije;
        this.oznaceni = oznaceni ;
        this.jmeno = jmeno;
        pocet++;
    }
    public void jez(){
        if (this.zije) {
            java.util.Scanner vstup = new java.util.Scanner(System.in);
            System.out.println("Zadej kolik kg jidla snedlo zvire " + this.jmeno + " :");
            this.zaludek += vstup.nextFloat();
            this.vek++;
        }
    }
    public void vymesuj(){
        java.util.Scanner vstup = new java.util.Scanner(System.in);
        System.out.println("Zadej kolik kg stravilo zvire " + this.jmeno + " :");
        this.zaludek -= vstup.nextFloat();
        if (this.zaludek < 0)
            this.zije = false;
        if (this.zije)
            this.vek++;
    }
    public void pojmenuj(){
        java.util.Scanner vstup = new java.util.Scanner(System.in);
        System.out.println("Zadej nove jmeno pro zvire " + this.jmeno + ":");
        this.jmeno = vstup.nextLine();
    }
    public abstract void informuj();

    public static void pocet(){
        System.out.println("Pocet zvirat v zoo: " + Zvire.pocet);
    }}
