package code._3_in_class.challenge1;

public class Fighter {
    private final String name;
    private int health;
    private final int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void attack(Fighter opponent) {
        opponent.health = opponent.health - this.damagePerAttack;
    }
}
