public class Obojzivelnici extends Zvire {
        public int idk;

        public Obojzivelnici(){
            super();
            idk=0;
        }

        public Obojzivelnici (char oznaceni, String jmeno, int idk ) {
            super (oznaceni, jmeno);
            this.idk = idk;
        }
        public Obojzivelnici(int vek, float zaludek, boolean zije, char oznaceni, String jmeno,int idk){
            super (vek, zaludek, zije, oznaceni, jmeno);
            this.idk = idk;

        }
        public void pojmenuj(){
            java.util.Scanner vstup = new java.util.Scanner(System.in);
            System.out.println("Zadej nove jmeno pro zvire " + this.jmeno + " ze tridy Obojzivelnici:");
            this.jmeno = vstup.nextLine();
        }
        public void informuj(){
            System.out.println("Jmeno zvirete je " + this.jmeno + " a oznaceni je " + this.oznaceni + " a zije " + this.zije +  " a vek je " +  this.vek  + " a zaludek je " + this.zaludek + "a pocet je " + this.idk);
        }
    }


}
