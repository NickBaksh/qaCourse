package practice_13_1.Task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class MovieService {
    private Map<Movie, List<Rating<?>>> movieRatings = new ConcurrentHashMap<>();

    public synchronized void addRating(Movie movie, Rating<?> rating) {
        movieRatings.computeIfAbsent(movie, k -> new ArrayList<>()).add(rating);
    }

    public double getAverageRating(Movie movie) {
        List<Rating<?>> ratings = movieRatings.get(movie);
        if (ratings == null || ratings.isEmpty()) {
            return 0;
        }
        double sum = ratings.stream()
                .mapToDouble(r -> r.getRating().doubleValue())
                .sum();
        return sum / ratings.size();
    }

    public List<Movie> getMoviesSortedByAverageRating() {
        return movieRatings.keySet()
                .stream()
                .sorted((movie1, movie2) -> Double.compare(getAverageRating(movie2), getAverageRating(movie1)))
                .collect(Collectors.toList());
    }
}
