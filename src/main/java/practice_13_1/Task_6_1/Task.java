package practice_13_1.Task_6_1;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task<T> {
    private final T id;
    private Status status;
    private Priority priority;
    private final LocalDateTime created;

    public Task(T id, Status status, Priority priority, LocalDateTime created) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.created = created;
    }

    public T getID() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task<?> task)) return false;
        return Objects.equals( id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Task={ID="+ id +", Status="+ status +", Priority="+ priority +", Created="+ created +"}";
    }
}
