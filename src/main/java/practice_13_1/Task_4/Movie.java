package practice_13_1.Task_4;

import java.util.Objects;

public class Movie {
    final String title;
    final String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(genre, movie.genre) && Objects.equals(title, movie.title);
    }

    @Override
    public String toString() {
        return "Movies={title= " + title +", genre="+ genre +"}";
    }
}
