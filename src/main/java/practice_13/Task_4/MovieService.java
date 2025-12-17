package practice_13.Task_4;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class MovieService {
    private Map<Movie, List<Rating<?>>> movieRatings = new ConcurrentHashMap<>();

    public void addRating(Movie movie, Rating<?> rating) {
        movieRatings.computeIfAbsent(movie, k -> new CopyOnWriteArrayList<>()).add(rating);
    }

    public double calculateAverageRating(Movie movie) {
        List<Rating<?>> ratings = movieRatings.get(movie);
        if (ratings == null || ratings.isEmpty()) {
            return 0;
        }
        double sum = ratings.stream()
                .mapToDouble(value -> value.getRating().doubleValue())
                .sum();
        return sum / ratings.size();
    }

    public List<Movie> sortByRating() {
        return movieRatings.keySet()
                .stream()
                .sorted((movie1, movie2) -> Double.compare(calculateAverageRating(movie2), calculateAverageRating(movie1)))
                .toList();
    }
}
