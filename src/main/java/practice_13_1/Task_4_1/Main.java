package practice_13_1.Task_4_1;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Taxi", "Comedy");
        Movie movie2 = new Movie("Avatar", "Sci-Fi");
        Movie movie3 = new Movie("Elky", "Sci-Fi");

        Rating<Double> rating1 = new Rating<>(8.5);
        Rating<Integer> rating2 = new Rating<>(7);
        Rating<Double> rating3 = new Rating<>(6.5);
        Rating<Double> rating4 = new Rating<>(7.5);

        MovieService movieService = new MovieService();
        movieService.addRating(movie1, rating1);
        movieService.addRating(movie3, rating4);
        movieService.addRating(movie1, rating2);


        movieService.addRating(movie2, rating3);

        System.out.println(movieService.calculateAverageRating(movie1));
        System.out.println(movieService.sortByRating());
    }
}
