import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.io.*;

class Student {
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

    // Vypsání info o studentovi
    public void vypisInfo() {
        System.out.println("Jmeno: " + jmeno + ", Prijmeni: " + prijmeni + ", Vek: " + vek + ", Prumer: " + prumer);
    }

    // Vrátí textovou reprezentaci pro uložení do souboru
    public String toText() {
        return jmeno + ";" + prijmeni + ";" + vek + ";" + prumer;
    }

    // Načte studenta ze stringu
    public static Student fromText(String text) {
        String[] parts = text.split(";");
        String jmeno = parts[0];
        String prijmeni = parts[1];
        int vek = Integer.parseInt(parts[2]);
        double prumer = Double.parseDouble(parts[3]);
        return new Student(jmeno, prijmeni, vek, prumer);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studenti = new ArrayList<>();
        int volba;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Pridat studenta");
            System.out.println("2. Vypsat vsechny studenty");
            System.out.println("3. Vyhledat studenta podle prijmeni");
            System.out.println("4. Seradit studenty podle prumeru");
            System.out.println("5. Ulozit studenty do souboru");
            System.out.println("6. Nacist studenty ze souboru");
            System.out.println("7. Konec");
            System.out.print("Vyber moznost: ");
            volba = scanner.nextInt();
            scanner.nextLine(); // odchytí nový řádek

            switch (volba) {
                case 1:
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

                    System.out.print("Zadej prumer: ");
                    double prumer = scanner.nextDouble();
                    scanner.nextLine(); // odchytí nový řádek

                    studenti.add(new Student(jmeno, prijmeni, vek, prumer));
                    System.out.println("Student pridan!");
                    break;

                case 2:
                    if (studenti.isEmpty()) {
                        System.out.println("Zadne studenty neni evidovano.");
                    } else {
                        for (Student s : studenti) {
                            s.vypisInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Zadej prijmeni: ");
                    String hledanePrijmeni = scanner.nextLine();
                    boolean nalezen = false;

                    for (Student s : studenti) {
                        if (s.prijmeni.equalsIgnoreCase(hledanePrijmeni)) {
                            s.vypisInfo();
                            nalezen = true;
                        }
                    }

                    if (!nalezen) {
                        System.out.println("Student nenalezen.");
                    }
                    break;

                case 4:
                    if (studenti.isEmpty()) {
                        System.out.println("Seznam studentu je prazdny.");
                    } else {
                        // Třídění podle průměru vzestupně (lepší studenti nahoře)
                        Collections.sort(studenti, new Comparator<Student>() {
                            @Override
                            public int compare(Student s1, Student s2) {
                                return Double.compare(s1.prumer, s2.prumer);
                            }
                        });
                        System.out.println("Studenti serazeni podle prumeru:");
                        for (Student s : studenti) {
                            s.vypisInfo();
                        }
                    }
                    break;

                case 5:
                    // Uloží seznam studentů do souboru
                    try {
                        FileWriter fw = new FileWriter("studenti.txt");
                        for (Student s : studenti) {
                            fw.write(s.toText() + "\n");
                        }
                        fw.close();
                        System.out.println("Studenti ulozeni do souboru studenti.txt");
                    } catch (IOException e) {
                        System.out.println("Chyba pri zapisu do souboru.");
                    }
                    break;

                case 6:
                    // Načte seznam studentů ze souboru
                    try {
                        BufferedReader br = new BufferedReader(new FileReader("studenti.txt"));
                        String radek;
                        studenti.clear(); // vyprázdnit původní seznam
                        while ((radek = br.readLine()) != null) {
                            studenti.add(Student.fromText(radek));
                        }
                        br.close();
                        System.out.println("Studenti nacteni ze souboru.");
                    } catch (IOException e) {
                        System.out.println("Chyba pri cteni souboru.");
                    }
                    break;

                case 7:
                    System.out.println("Program ukoncen.");
                    break;

                default:
                    System.out.println("Neplatna volba.");
            }
        } while (volba != 7);

        scanner.close();
    }
}
