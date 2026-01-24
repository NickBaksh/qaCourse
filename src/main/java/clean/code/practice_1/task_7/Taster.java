package clean.code.practice_1.task_7;

public class Taster implements Worker, Eater {
    @Override
    public void eat() {
        System.out.println("Дегустатор ест еду");
    }

    @Override
    public void work() {
        System.out.println("Дегустатор на работе пробует еду");
    }
}
