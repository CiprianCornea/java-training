package code._3_in_class.challenge2;

public class Studio {
    private String name;
    private Movie[] movies;

    public Studio(String name, Movie[] movies) {
        this.name = name;
        this.movies = movies;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public String getName() {
        return name;
    }
}
