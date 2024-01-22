import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TaskManager {
    private List<Task> taskList;

    public Task searchTaskById(int taskId) {
        for (Task task : taskList) {
            if (task.getTaskID() == taskId) {
                return task;
            }
        }
        return null;
    }

    public TaskManager() {
        taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void removeTask(int taskId) {
        taskList.removeIf(task -> task.getTaskID() == taskId);
    }

    public void markTaskAsCompleted(int taskId) {
        for (Task task : taskList) {
            if (task.getTaskID() == taskId) {
                task.setStatus(true);
                break;
            }
        }
    }

    public void displayTasks() {
        if (taskList.isEmpty()) {
            System.out.println("Task list is empty.");
        } else {
            for (Task task : taskList) {
                System.out.println("Task ID: " + task.getTaskID());
                System.out.println("Description: " + task.getDescription());
                System.out.println("Due Date: " + task.getDueDate());
                System.out.println("Status: " + (task.getStatus() ? "Completed" : "Not Completed"));
            }
        }
    }
}
