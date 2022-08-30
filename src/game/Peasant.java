package game;

public class Peasant extends BaseHero {
    private boolean delivery;

    public Peasant(String name, int healPoint, int damage, int[] attack, int defence, int speed, boolean delivery) {
        super(name, healPoint, damage, attack, defence, speed);
        this.delivery = delivery;
    }

    public String getInfo() {
        return String.format("Class Peasant ::: %s", super.getInfo());
    }
}
