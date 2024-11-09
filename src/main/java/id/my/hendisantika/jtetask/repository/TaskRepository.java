package id.my.hendisantika.jtetask.repository;

import id.my.hendisantika.jtetask.model.Task;
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
}
