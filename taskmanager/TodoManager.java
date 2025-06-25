package collectionframeworks.exercise.taskmanager;

import java.util.List;

public interface TodoManager {

    boolean addTask(String title, String description);

    List<Task> getAllTasks();

    boolean markTaskAsCompleted(Long id);

    boolean deleteTask(Long id);

}
