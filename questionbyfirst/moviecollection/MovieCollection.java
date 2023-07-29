package questionbyfirst.moviecollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieCollection implements Iterable<Movie> {
    private List<Movie> movies;

    public MovieCollection() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public boolean removeMovie(Movie movie) {
        return movies.remove(movie);
    }

    public void viewMovies() {
        if (movies.isEmpty()) {
            System.out.println("The movie collection is empty.");
        } else {
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }

    public List<Movie> searchByTitle(String title) {
        List<Movie> results = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(movie);
            }
        }
        return results;
    }

    public List<Movie> searchByDirector(String director) {
        List<Movie> results = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getDirector().toLowerCase().contains(director.toLowerCase())) {
                results.add(movie);
            }
        }
        return results;
    }

    public List<Movie> searchByReleaseYear(int year) {
        List<Movie> results = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getReleaese_year() == year) {
                results.add(movie);
            }
        }
        return results;
    }

    public List<Movie> searchByGenre(String genre) {
        List<Movie> results = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getGenre().toLowerCase().contains(genre.toLowerCase())) {
                results.add(movie);
            }
        }
        return results;
    }

    public List<Movie> searchByRating(double rating) {
        List<Movie> results = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getRating() == rating) {
                results.add(movie);
            }
        }
        return results;
    }

    @Override
    public Iterator<Movie> iterator() {
        return movies.iterator();
    }
}