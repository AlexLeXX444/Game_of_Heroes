package game;

public class Wizard extends BaseHero{
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
    public Wizard(String name, int healPoint, int damage, int[] attack, int defence, int speed) {
        super(name, healPoint, damage, attack, defence, speed);
        this.maic = true;
    }

    public Wizard(int healPoint, int damage, int[] attack, int defence, int speed) {
        super("wizard", healPoint, damage, attack, defence, speed);
        this.maic = true;
    }

    public String getInfo() {
        return String.format("Class Wizard ::: %s", super.getInfo());
    }
}
