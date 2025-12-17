package practice_13.Task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService<T> {
    private final List<Task<T>> service = new ArrayList<>();

    public void addTask(Task<T> task) {
        service.add(task);
    }

    public synchronized void removeById(T id) {
        service.removeIf(tTask -> tTask.getID().equals(id));
    }

    public List<Task<T>> filterByStatus(Status status) {
        return service.stream()
                .filter(tTask -> tTask.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    public List<Task<T>> filterByPriority(Priority priority) {
        return service.stream()
                .filter(tTask -> tTask.getPriority().equals(priority))
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortByCreatedDateFromOldToNew() {
        return service.stream()
                .sorted((date1, date2) -> date1.getCreated().compareTo(date2.getCreated()))
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortByCreatedDateFromNewToOld() {
        return service.stream()
                .sorted((date1, date2) -> date2.getCreated().compareTo(date1.getCreated()))
                .collect(Collectors.toList());
    }

    public List<Task<T>> getAll() {
        return new ArrayList<>(service);
    }
}
