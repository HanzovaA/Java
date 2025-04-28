import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("\n=== TO-DO APLIKACE ===");
            System.out.println("1. Přidat úkol");
            System.out.println("2. Zobrazit úkoly");
            System.out.println("3. Označit úkol jako hotový");
            System.out.println("4. Smazat úkol");
            System.out.println("5. Konec");
            System.out.print("Zadej volbu: ");

            int volba = sc.nextInt();
            sc.nextLine(); // konzumace \n

            switch (volba) {
                case 1:
                    System.out.print("Popis úkolu: ");
                    String popis = sc.nextLine();
                    System.out.print("Priorita (1-5): ");
                    int priorita = sc.nextInt();
                    sc.nextLine(); // \n
                    manager.addTask(popis, priorita);
                    break;
                case 2:
                    manager.listTasks();
                    break;
                case 3:
                    System.out.print("Zadej číslo úkolu: ");
                    int hotovy = sc.nextInt();
                    sc.nextLine();
                    manager.markCompleted(hotovy - 1);
                    break;
                case 4:
                    System.out.print("Zadej číslo úkolu ke smazání: ");
                    int smazat = sc.nextInt();
                    sc.nextLine();
                    manager.removeTask(smazat - 1);
                    break;
                case 5:
                    System.out.println("Aplikace ukončena.");
                    return;
                default:
                    System.out.println("Neplatná volba.");
            }
        }
    }
}
