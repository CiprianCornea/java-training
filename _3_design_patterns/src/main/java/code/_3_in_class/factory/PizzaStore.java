package code._3_in_class.factory;

public abstract class PizzaStore {
    protected abstract Pizza createPizza (String type);

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
