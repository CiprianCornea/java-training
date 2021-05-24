package code._3_in_class.factory;

public class Pizza {
    private String name;
    private String dough;
    private String topping;

    public Pizza(String name, String dough, String topping) {
        this.name = name;
        this.dough = dough;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }

    public void bake() {
        System.out.println("Bake pizza" + name);
    }

    public void cut() {
        System.out.println("Cut pizza" + name);
    }

    public void box() {
        System.out.println("Put in the box pizza" + name);
    }
}
