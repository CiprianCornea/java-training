package code._3_in_class;

import code._3_in_class.decorator.Beverage;
import code._3_in_class.decorator.Chocolate;
import code._3_in_class.decorator.Coffee;
import code._3_in_class.decorator.Milk;
import code._3_in_class.factory.AmericanPizzaStore;
import code._3_in_class.factory.EuropeanPizzaStore;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here

//        Lazy Init
//        LazyInit li = LazyInit.getInstance();
//        System.out.println(li);
//
//        LazyInit li2 = LazyInit.getInstance();
//        System.out.println(li2);
//
//        LazyInit li3 = LazyInit.getInstance();
//        System.out.println(li3);

//        Pizza factory
//        System.out.println("Factory pattern");
//        AmericanPizzaStore americanPizzaStore = new AmericanPizzaStore();
//        EuropeanPizzaStore europeanPizzaStore = new EuropeanPizzaStore();
//
//        System.out.println(americanPizzaStore.orderPizza("ChickenPizza"));
//        System.out.println(europeanPizzaStore.orderPizza("Margherita"));

//        Decorator
        System.out.println("Decorator");
        Beverage coffee = new Coffee();
        coffee = new Milk(coffee);
        coffee = new Chocolate(coffee);

        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());

    }
}