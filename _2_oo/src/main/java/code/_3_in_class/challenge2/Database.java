package code._3_in_class.challenge2;

public class Database {
    public Studio[] getData() {
        Prize oscar1990 = new Prize("oscar", 1990);
        Prize oscar2000 = new Prize("oscar", 2000);
        Prize oscar2010 = new Prize("oscar", 2010);
        Prize oscar2018 = new Prize("oscar", 2020);

        Actor actorOscar1990 = new Actor("actor with 2 oscars", 35,
                new Prize[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor with oscar 2010", 55,
                new Prize[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor with oscar 2018", 23,
                new Prize[]{oscar2018});
        Actor actorWithoutPrizes1 = new Actor("actor without oscar 01", 33,
                new Prize[]{});
        Actor actorWithoutPrizes2 = new Actor("actor without oscar 02", 60,
                new Prize[]{});
        Actor actorWithoutPrizes3 = new Actor("actor without oscar 03", 20,
                new Prize[]{});

        Movie movie1 = new Movie(1990, "movie with oscar actors",
                new Actor[]{actorOscar1990, actorWithoutPrizes1});

        Movie movie2 = new Movie(2010, "movie with actors without oscar 1",
                new Actor[]{actorWithoutPrizes1, actorWithoutPrizes2, actorWithoutPrizes3});
        Movie movie3 = new Movie(2010, "movie with actors without oscar 2",
                new Actor[]{actorWithoutPrizes1, actorWithoutPrizes2, actorWithoutPrizes3});
        Movie movie4 = new Movie(2018, "movie with oscar actors",
                new Actor[]{actorOscar2010, actorOscar2018, actorWithoutPrizes2});
        Movie movie5 = new Movie(2018, "movie with actors without oscar 3",
                new Actor[]{actorWithoutPrizes2, actorWithoutPrizes3});

        Studio studio1 = new Studio("MGM", new Movie[]{movie1, movie2});
        Studio studio2 = new Studio("Disney", new Movie[]{movie3, movie4, movie5});

        return new Studio[]{studio1, studio2};
    }

    public void printAllStudiosWithMinimumThreeMovies() {
        for (Studio studio : this.getData()) {
            if (studio.getMovies().length > 2) {
                System.out.println(studio.getName());
            }
        }
    }

    public void printAllStudiosWithActorGiven() {
        for (Studio studio : this.getData()) {
            for (Movie movie : studio.getMovies()) {
                for (Actor actor : movie.getActors()) {
                    if (actor.getName().equals("actor with 2 oscars")) {
                        System.out.println(studio.getName());
                    }
                }
            }
        }
    }

    public void printAllMoviesWithAtLeastAnPlus50YearsActor(){
        for (Studio studio : this.getData()) {
            for (Movie movie : studio.getMovies()) {
                for (Actor actor : movie.getActors()) {
                    if (actor.getAge() > 50) {
                        System.out.println(movie.getName());
                    }
                }
            }
        }
    }
}
