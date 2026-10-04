package enemy;

public class Enemy {

    private final String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int amount) {
        health = Math.max(0, health - amount);
        System.out.println(name + " takes " + amount + " damage (" + health + " HP left)");
    }

    public void addEffect(String effectName) {
        System.out.println(name + " is now affected by " + effectName);
    }
}