package practice_13.Task_3;

public class Main {
    public static void main(String[] args) {

        GradeService<Double> gradeService = new GradeService<>();
        gradeService.addGrade(new StudentGrade<>("Pasha", "Physics", 5.0));
        gradeService.addGrade(new StudentGrade<>("Petya", "Physics", 4.5));
        gradeService.addGrade(new StudentGrade<>("Alex", "Math", 4.0));

        System.out.println(gradeService.calculateAverageGrade("Physics"));
        //Проверка падения исключения InvalidGradeException при отсутствии оценок по предмету
        try {
            gradeService.calculateAverageGrade("CS50");
        } catch (InvalidGradeException e) {
            System.out.println("Упало исключение InvalidGradeException с текстом: " + e.getMessage());
        }

        System.out.println(gradeService.getAllGrades());
    }
}
