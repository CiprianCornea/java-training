package code._3_in_class.factory;

public class EuropeanPizzaStore extends PizzaStore{
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "Sweet":
                pizza = new QuatroStagione();
                break;
            case "ChickenPizza":
                pizza = new Margherita();
                break;
            default:
                pizza = new Margherita();
        }

        return pizza;
    }
}
