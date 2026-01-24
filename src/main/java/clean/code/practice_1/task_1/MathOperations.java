package clean.code.practice_1.task_1;

public class MathOperations {
    public static int add(int...numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }
}

