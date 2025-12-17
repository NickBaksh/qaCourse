package practice_13.task_1;


public class Main {
    public static void main(String[] args) {
        EntityManager<Entity> students = new EntityManager<>();

        students.add(new Entity("Pasha", 24, true));
        students.add(new Entity("Olga", 14, true));
        students.add(new Entity("Vova", 23, false));
        Entity petya = new Entity("Petya", 53, false);
        students.add(petya);
        System.out.println(students.getAll());

        //Проверяем, что при повторном удалении Пети метод remove вернет false
        System.out.println(students.remove(petya));
        System.out.println(students.remove(petya));
        System.out.println(students.getAll());

        //Проверяем что в фильтр по возрасту попадет только Паша
        System.out.println(students.filterByAge(24, 25));
        //Проверяем что в фильтр по имени попадет только Оля
        System.out.println(students.filterByName("Olga"));

        //Проверяем что в фильтр по флагу активности попадут только Паша с Олей
        System.out.println(students.filterByActive());
    }
}
