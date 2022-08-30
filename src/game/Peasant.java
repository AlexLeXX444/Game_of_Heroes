package game;

public class Peasant extends BaseHero {
    private boolean delivery;

    /**
     * Args of class:
     * @param name
     * @param healPoint
     * @param damage
     * @param attack
     * @param defence
     * @param speed
     */
    public Peasant(String name, int healPoint, int damage, int[] attack, int defence, int speed) {
        super(name, healPoint, damage, attack, defence, speed);
        this.delivery = true;
    }

    public Peasant(int healPoint, int damage, int[] attack, int defence, int speed) {
        super("peasant", healPoint, damage, attack, defence, speed);
        this.delivery = true;
    }

    public String getInfo() {
        return String.format("Class Peasant ::: %s", super.getInfo());
    }
}
