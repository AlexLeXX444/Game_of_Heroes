package game;

public class Monk extends BaseHero{
    private boolean maic;

    /**
     * Args of class:
     * @param name
     * @param healPoint
     * @param damage
     * @param attack
     * @param defence
     * @param speed
     */
    public Monk(String name, int healPoint, int damage, int[] attack, int defence, int speed) {
        super(name, healPoint, damage, attack, defence, speed);
        this.maic = true;
    }

    public Monk(int healPoint, int damage, int[] attack, int defence, int speed) {
        super("Monk", healPoint, damage, attack, defence, speed);
        this.maic = true;
    }

    public String getInfo() {
        return String.format("Class monk ::: %s", super.getInfo());
    }
}
