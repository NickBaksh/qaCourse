package practice_13_1.Task_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice_13_1.Task_6_1.Priority;
import practice_13_1.Task_6_1.Status;
import practice_13_1.Task_6_1.Task;
import practice_13_1.Task_6_1.TaskService;

import java.time.LocalDateTime;
import java.util.List;

public class TaskServiceTest {
    private TaskService<Integer> taskService;

    @BeforeEach
    void setUp() {
        taskService = new TaskService<>();
    }

    //Проверка добавления задачи в сервис
    //Проверка удаления задачи из сервиса
    //Фильтрация задач по статусу
    //Фильтрация задач по приоритету
    //Сортировка задач по дате создания (от старых задач к новым)
    //Сортировка задач по дате создания (от новых задач к старым)

    @Test
    @DisplayName("Проверка добавления задачи в сервис")
    public void shouldAddTaskToService() {
        Task<Integer> task = new Task<>(1, Status.PROGRESS, Priority.LOW, LocalDateTime.now());
        taskService.addTask(task);

        Assertions.assertEquals(1, taskService.getAll().size());
        Assertions.assertTrue(taskService.getAll().contains(task));
    }

    @Test
    @DisplayName("Проверка удаления задачи из сервиса")
    public void shouldRemoveTaskFromServiceById() {
        Task<Integer> task = new Task<>(1, Status.PROGRESS, Priority.LOW, LocalDateTime.now());
        taskService.addTask(task);

        Assertions.assertEquals(1, taskService.getAll().size());
        Assertions.assertTrue(taskService.getAll().contains(task));

        taskService.removeById(1);
        Assertions.assertEquals(0, taskService.getAll().size());
        Assertions.assertFalse(taskService.getAll().contains(task));
    }

    @Test
    @DisplayName("Фильтрация задач по статусу")
    public void shouldReturnTasksByStatus() {
        Task<Integer> task1 = new Task<>(1, Status.PROGRESS, Priority.LOW, LocalDateTime.now());
        Task<Integer> task2 = new Task<>(2, Status.NEW, Priority.HIGH, LocalDateTime.now());
        taskService.addTask(task1);
        taskService.addTask(task2);

        Assertions.assertEquals(2, taskService.getAll().size());
        Assertions.assertTrue(taskService.getAll().contains(task1));
        Assertions.assertTrue(taskService.getAll().contains(task2));

        List<Task<Integer>> filteredByStatus = taskService.filterByStatus(Status.NEW);
        Assertions.assertEquals(1, filteredByStatus.size());
        Assertions.assertTrue(filteredByStatus.contains(task2));
    }

    @Test
    @DisplayName("Фильтрация задач по приоритету")
    public void shouldReturnTasksByPriority() {
        Task<Integer> task1 = new Task<>(1, Status.PROGRESS, Priority.LOW, LocalDateTime.now());
        Task<Integer> task2 = new Task<>(2, Status.NEW, Priority.HIGH, LocalDateTime.now());
        taskService.addTask(task1);
        taskService.addTask(task2);

        Assertions.assertEquals(2, taskService.getAll().size());
        Assertions.assertTrue(taskService.getAll().contains(task1));
        Assertions.assertTrue(taskService.getAll().contains(task2));

        List<Task<Integer>> filteredByPriority = taskService.filterByPriority(Priority.HIGH);
        Assertions.assertEquals(1, filteredByPriority.size());
        Assertions.assertTrue(filteredByPriority.contains(task2));
    }

    @Test
    @DisplayName("Сортировка задач по дате создания (от старых к новым задачам)")
    public void shouldReturnTasksByCreatedDateAsc() {
        Task<Integer> task1 = new Task<>(1, Status.PROGRESS, Priority.LOW, LocalDateTime.now());
        Task<Integer> task2 = new Task<>(2, Status.NEW, Priority.HIGH, LocalDateTime.now().minusHours(5));
        taskService.addTask(task1);
        taskService.addTask(task2);

        Assertions.assertEquals(2, taskService.getAll().size());
        Assertions.assertTrue(taskService.getAll().contains(task1));
        Assertions.assertTrue(taskService.getAll().contains(task2));

        List<Task<Integer>> sortedByCreatedDateFromOldToNew = taskService.sortByCreatedDateFromOldToNew();
        Assertions.assertEquals(2, sortedByCreatedDateFromOldToNew.size());
        Assertions.assertEquals(task2, sortedByCreatedDateFromOldToNew.get(0));
    }

    @Test
    @DisplayName("Сортировка задач по дате создания (от новых к старым задачам)")
    public void shouldReturnTasksByCreatedDateDesc() {
        Task<Integer> task1 = new Task<>(1, Status.PROGRESS, Priority.LOW, LocalDateTime.now());
        Task<Integer> task2 = new Task<>(2, Status.NEW, Priority.HIGH, LocalDateTime.now().minusHours(5));
        taskService.addTask(task1);
        taskService.addTask(task2);

        Assertions.assertEquals(2, taskService.getAll().size());
        Assertions.assertTrue(taskService.getAll().contains(task1));
        Assertions.assertTrue(taskService.getAll().contains(task2));

        List<Task<Integer>> sortedByCreatedDateFromNewToOld = taskService.sortByCreatedDateFromNewToOld();
        Assertions.assertEquals(2, sortedByCreatedDateFromNewToOld.size());
        Assertions.assertEquals(task1, sortedByCreatedDateFromNewToOld.get(0));
    }
}
