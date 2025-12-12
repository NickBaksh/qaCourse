package practice_13_1.Task_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice_13_1.Task_4_1.Movie;
import practice_13_1.Task_4_1.MovieService;
import practice_13_1.Task_4_1.Rating;

import java.util.ArrayList;
import java.util.List;

public class MovieServiceTest {

    private MovieService movieService;

    @BeforeEach
    void setUp() {
        movieService = new MovieService();
    }

    //Кейсы
    //Добавление рейтинга фильму
    //Расчет среднего рейтинга по фильму
    //Сортировку фильмов по рейтингу


    //Проверяем добавление рейтинга фильму
    @Test
    @DisplayName("Метод должен вернуть значение добавленного фильму рейтинга")
    public void shouldAddNewRatingToFilm() {
        Movie movie = new Movie("Avatar", "Sci-Fi");
        Rating<Integer> rating = new Rating<>(5);
        movieService.addRating(movie, rating);

        Assertions.assertEquals(5, rating.getRating());
        Assertions.assertEquals(5, movieService.calculateAverageRating(movie));
    }

    //Проверяем, что средняя оценка рассчитывается верно
    @Test
    @DisplayName("Метод должен вернуть средний рейтинг по фильму")
    public void shouldCalculateAverageRating() {
        Movie movie = new Movie("Avatar", "Sci-Fi");

        Rating<Integer> rating1 = new Rating<>(6);
        Rating<Double> rating2 = new Rating<>(8.0);

        movieService.addRating(movie, rating1);
        movieService.addRating(movie, rating2);

        Assertions.assertEquals(7.0, movieService.calculateAverageRating(movie));
    }

    //Проверяем что фильм с самым высоким рейтингом идет первым в списке
    @Test
    @DisplayName("Метод должен вернуть отсортированный по рейтингу (по убыванию) список фильмов")
    public void shouldReturnSortedList() {
        List<Movie> sortedList = new ArrayList<>();

        Movie movie1 = new Movie("Avatar", "Sci-Fi");
        Movie movie2 = new Movie("Titanic", "Drama");

        Rating<Integer> rating1 = new Rating<>(6);
        Rating<Double> rating2 = new Rating<>(8.0);

        movieService.addRating(movie1, rating1);
        movieService.addRating(movie2, rating2);

        Assertions.assertEquals(movie2, movieService.sortByRating().get(0));
        Assertions.assertEquals(movie1, movieService.sortByRating().get(1));
    }
}
