package code._3_in_class;

import code._3_in_class.challenge1.BoxingMatch;
import code._3_in_class.challenge1.Fighter;
import code._3_in_class.challenge2.Database;

import java.util.Date;

public class Main {

    public Integer primitive2(Integer i) {
        i = 2;
        return i;
    }

    public void references(Date d) {
        d.setYear(2000);
    }

    public static void main(String[] args) {
        //TODO put your code changes in here

//        Integer p2 = new Integer(7);
//        Main main = new Main();
//
//        // Integer is immutable
//        System.out.println(p2);
//        p2 = main.primitive2(p2);
//        System.out.println(p2);
//        System.out.println();
//
//        Date d = new Date(2018, 5, 12);
//        System.out.println(d.getYear());
//        main.references(d);
//        System.out.println(d.getYear());
//        System.out.println();
//
//        Date currentDate = new Date(2018,6,3);
//        System.out.println(currentDate.getYear());
//        main.references(currentDate);
//        System.out.println(currentDate.getYear());

        System.out.println("Challenge 1: ");
        Fighter fighter1 = new Fighter("Marius", 100, 15);
        Fighter fighter2 = new Fighter("Cristi", 100, 25);
        BoxingMatch boxingMatch = new BoxingMatch(fighter1, fighter2);
        System.out.println(boxingMatch.fight());
        System.out.println();

        System.out.println("Challenge 2: ");
        Database database = new Database();
        System.out.println("3.1");
        database.printAllStudiosWithMinimumThreeMovies();
        System.out.println("3.2");
        database.printAllStudiosWithActorGiven();
        System.out.println("3.3");
        database.printAllMoviesWithAtLeastAnPlus50YearsActor();
    }
}