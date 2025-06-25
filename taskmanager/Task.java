
package collectionframeworks.exercise.taskmanager;

public class Task {

    private static Long nextId = 1L;

    private Long id;

    private String title;

    private String description;

    private Boolean isCompleted;

    public Task() {
        this("N/A", "N/A");
        this.id = nextId++;
    }

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public static Long getNextId() {
        return nextId;
    }

    public static void setNextId(Long nextId) {
        Task.nextId = nextId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

}
