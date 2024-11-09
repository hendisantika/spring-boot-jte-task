package id.my.hendisantika.jtetask.repository;

import id.my.hendisantika.jtetask.model.Task;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jte-task
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/11/24
 * Time: 16.06
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class TaskRepository {

    private final List<Task> tasks = new ArrayList<>();

    public TaskRepository() {
    }

    public List<Task> findAll() {
        return tasks;
    }

    public void create(Task task) {
        tasks.add(task);
    }

    public boolean remove(String id) {
        return tasks.removeIf(task -> task.getId().equals(id));
    }

    @PostConstruct
    private void init() {
        tasks.addAll(List.of(
                new Task("Complete project proposal"),
                new Task("Review code changes"),
                new Task("Attend team meeting"),
                new Task("Update documentation"),
                new Task("Fix reported bugs"),
                new Task("Prepare presentation slides"),
                new Task("Respond to client emails"),
                new Task("Run unit tests"),
                new Task("Refactor legacy code"),
                new Task("Plan next sprint")
        ));
    }
}
