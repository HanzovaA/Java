import java.util.ArrayList;
import java.util.Scanner;

class Student {
    // Atributy studenta
    String jmeno;
    String prijmeni;
    int vek;
    double prumer;

    // Konstruktor
    public Student(String jmeno, String prijmeni, int vek, double prumer) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.prumer = prumer;
    }

    // Metoda na pěkné vypsání informací o studentovi
    public void vypisInfo() {
        System.out.println("Jmeno: " + jmeno + ", Prijmeni: " + prijmeni + ", Vek: " + vek + ", Prumer: " + prumer);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studenti = new ArrayList<>();  // seznam studentů

        int volba;
        do {
            // Zobrazit menu
            System.out.println("\n--- MENU ---");
            System.out.println("1. Pridat studenta");
            System.out.println("2. Vypsat vsechny studenty");
            System.out.println("3. Vyhledat studenta podle prijmeni");
            System.out.println("4. Konec");
            System.out.print("Vyber moznost: ");
            volba = scanner.nextInt();
            scanner.nextLine();  // odchytí nový řádek po nextInt()

            switch (volba) {
                case 1:
                    // Přidání nového studenta
                    System.out.print("Zadej jmeno: ");
                    String jmeno = scanner.nextLine();
                    System.out.print("Zadej prijmeni: ");
                    String prijmeni = scanner.nextLine();

                    int vek;
                    do {
                        System.out.print("Zadej vek (kladne cislo): ");
                        vek = scanner.nextInt();
                        if (vek <= 0) {
                            System.out.println("Vek musi byt kladne cislo.");
                        }
                    } while (vek <= 0);

                    System.out.print("Zadej prumer (napr. 1.5): ");
                    double prumer = scanner.nextDouble();
                    scanner.nextLine();  // odchytí nový řádek

                    // Vytvořit nového studenta a přidat ho do seznamu
                    Student novyStudent = new Student(jmeno, prijmeni, vek, prumer);
                    studenti.add(novyStudent);

                    System.out.println("Student pridan!");
                    break;

                case 2:
                    // Vypsání všech studentů
                    if (studenti.isEmpty()) {
                        System.out.println("Zadne studenty neni evidovano.");
                    } else {
                        for (Student s : studenti) {
                            s.vypisInfo();
                        }
                    }
                    break;

                case 3:
                    // Vyhledání studenta podle příjmení
                    System.out.print("Zadej prijmeni studenta k vyhledani: ");
                    String hledanePrijmeni = scanner.nextLine();
                    boolean nalezeno = false;

                    for (Student s : studenti) {
                        if (s.prijmeni.equalsIgnoreCase(hledanePrijmeni)) {
                            s.vypisInfo();
                            nalezeno = true;
                        }
                    }

                    if (!nalezeno) {
                        System.out.println("Student s timto prijmenim nebyl nalezen.");
                    }
                    break;

                case 4:
                    // Ukončení programu
                    System.out.println("Program ukoncen.");
                    break;

                default:
                    System.out.println("Neplatna volba, zkus znovu.");
            }
        } while (volba != 4);

        scanner.close(); // Zavřít scanner
    }
}
