package practice_13.Task_6;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Task<Integer> moringTask = new Task<>(1, Status.NEW, Priority.HIGH, LocalDateTime.now().minusHours(8));
        Task<Integer> eveningTask = new Task<>(2, Status.PROGRESS, Priority.MEDIUM, LocalDateTime.now());

        TaskService<Integer> taskService = new TaskService<>();
        taskService.addTask(moringTask);
        taskService.addTask(eveningTask);

        System.out.println("Все добавленные задачи: " + taskService.getAll());

        taskService.removeById(1);
        System.out.println("Должна остаться 1 задача с ID:2 " + taskService.getAll());

        taskService.addTask(moringTask);
        System.out.println("Задача с высоким приоритетом: " + taskService.filterByPriority(Priority.HIGH));
        System.out.println("Задача в работе: " + taskService.filterByStatus(Status.PROGRESS));
        System.out.println("Отсортированы по возрастанию" + taskService.sortByCreatedDateFromNewToOld());
        System.out.println("Отсортированы по убыванию" + taskService.sortByCreatedDateFromOldToNew());
    }
}
