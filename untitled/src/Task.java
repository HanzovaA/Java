public class Task {
    private String description; // popis úkolu
    private int priority;       // priorita úkolu (1-5)
    private boolean completed;  // stav splnění

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
        this.completed = false; // výchozí stav je nesplněno
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "[" + (completed ? "X" : " ") + "] "
                + description + " (Priorita: " + priority + ")";
    }
}
