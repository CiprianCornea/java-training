package code._3_in_class.challenge2;

public class Actor {
    private String name;
    private Integer age;
    private Prize[] prizes;

    public Actor(String name, Integer age, Prize[] prizes) {
        this.name = name;
        this.age = age;
        this.prizes = prizes;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
