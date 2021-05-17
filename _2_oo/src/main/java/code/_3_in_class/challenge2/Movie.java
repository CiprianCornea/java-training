package code._3_in_class.challenge2;

public class Movie {
    private Integer appearanceYear;
    private String name;
    private Actor[] actors;

    public Movie(Integer appearanceYear, String name, Actor[] actors) {
        this.appearanceYear = appearanceYear;
        this.name = name;
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public Actor[] getActors() {
        return actors;
    }
}
