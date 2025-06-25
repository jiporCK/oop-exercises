package collectionframeworks.exercise.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class TodoManagerImpl implements TodoManager{

    static List<Task> tasks = new ArrayList<>();

    @Override
    public boolean addTask(String title, String description) {
        return tasks.add(new Task(title, description));
    }

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }

    @Override
    public boolean markTaskAsCompleted(Long id) {
        for (Task t : tasks) {
            if (t.getId().equals(id)) {
                t.setCompleted(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteTask(Long id) {
        for (Task t : tasks) {
            if (t.getId().equals(id)) {
                tasks.remove(t);
                return true;
            }
        }
        return false;
    }

}
