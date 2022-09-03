package game;

public class Spearman extends BaseHero{
    /**
     * Args of class:
     * @param name
     * @param healPoint
     * @param damage
     * @param attack
     * @param defence
     * @param speed
     */
    public Spearman(String name, int healPoint, int damage, int[] attack, int defence, int speed) {
        super(name, healPoint, damage, attack, defence, speed);
    }

    public Spearman(int healPoint, int damage, int[] attack, int defence, int speed) {
        super("spearman", healPoint, damage, attack, defence, speed);
    }

    public String getInfo() {
        return String.format("Class \u001B[36m Spearman \u001B[37m \t:::\t %s", super.getInfo());
    }
}
