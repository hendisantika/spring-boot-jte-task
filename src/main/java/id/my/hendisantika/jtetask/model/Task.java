package id.my.hendisantika.jtetask.model;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jte-task
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/11/24
 * Time: 16.05
 * To change this template use File | Settings | File Templates.
 */
public class Task {
    private final String id;
    private final String description;

    public Task(String description) {
        this.id = UUID.randomUUID().toString();
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
