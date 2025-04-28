import java.util.Scanner;

// Třída pro geometrický tvar
abstract class GeometrickyTvar {
    abstract double spocitejObsah();
    abstract double spocitejObvod();
}

// Třída pro čtverec
class Ctverec extends GeometrickyTvar {
    Scanner scanner = new Scanner(System.in);
    double strana;

    public Ctverec() {
        System.out.println("zadejte velikost strany ctverce");
        strana = Double.parseDouble(scanner.next());
    }
    @Override
    double spocitejObsah() {
        return strana * strana;
    }

    @Override
    double spocitejObvod() {

        return 4 * strana;
    } }

// Třída pro obdélník
 class Obdelnik extends GeometrickyTvar {
    double stranaA;
    double stranaB;

    public Obdelnik() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("zadej velikost strany a");
        stranaA = Double.parseDouble(scanner.next());

        System.out.println("zadej velikost strany b");
        stranaB = Double.parseDouble(scanner.next());
    }


    double spocitejObsah() {
        return stranaA * stranaB;
    }

    double spocitejObvod() {
        return 2 * (stranaA + stranaB);
    }
}

// Hlavní třída programu
public class Main {
    public static void main(String[] args) {

        Ctverec ctverec = new Ctverec();
        System.out.println("Obsah čtverce: " + ctverec.spocitejObsah());
        System.out.println("Obvod čtverce: " + ctverec.spocitejObvod());


        Obdelnik obdelnik = new Obdelnik();
        System.out.println("Obsah obdélníku: " + obdelnik.spocitejObsah());
        System.out.println("Obvod obdélníku: " + obdelnik.spocitejObvod());
    }
}