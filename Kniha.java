
public class Kniha {
    String nazev;
    String autor;

    public Kniha(String nazev, String autor) {
        this.nazev = nazev;
        this.autor = autor;
    }

    public void vypisInfo() {
        System.out.println("Název: " + nazev + ", Autor: " + autor);
    }
}
