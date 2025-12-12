package practice_13_1.Task_4;

public class Rating<T extends Number> {
    private final T rating;

    public Rating(T rating) {
        if (rating.doubleValue() < 1 || rating.doubleValue() > 10) {
            throw new IllegalArgumentException("Рейтинг должен быть в диапазоне от 1 до 10");
        }
        this.rating = rating;
    }

    public T getRating() {
        return this.rating;
    }

    @Override
    public String toString() {
        return "Rating={rating="+ rating +"}";
    }
}
