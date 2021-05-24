package code._3_in_class.factory;

public class AmericanPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "Sweet":
                pizza = new SweetPizza();
                break;
            case "ChickenPizza":
                pizza = new ChickenPizza();
                break;
            default:
                pizza = new ChickenPizza();
        }

        return pizza;
    }
}
