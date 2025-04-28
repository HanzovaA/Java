import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks; // seznam všech úkolů

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description, int priority) {
        Task task = new Task(description, priority);
        tasks.add(task);
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Žádné úkoly.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void markCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
            System.out.println("Úkol označen jako hotový.");
        } else {
            System.out.println("Neplatný index.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Úkol byl odstraněn.");
        } else {
            System.out.println("Neplatný index.");
        }
    }
}
