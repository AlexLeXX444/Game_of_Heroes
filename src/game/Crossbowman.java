package game;

public class Crossbowman extends BaseHero{
    private int rangeDamage;

    /**
     * Args of class:
     * @param name
     * @param healPoint
     * @param damage
     * @param attack
     * @param defence
     * @param speed
     * @param rangeDamage
     */
    public Crossbowman(String name, int healPoint, int damage, int[] attack, int defence, int speed, int rangeDamage) {
        super(name, healPoint, damage, attack, defence, speed);
        this.rangeDamage = rangeDamage;
    }

    public Crossbowman(int healPoint, int damage, int[] attack, int defence, int speed, int rangeDamage) {
        super("Bowman One", healPoint, damage, attack, defence, speed);
        this.rangeDamage = rangeDamage;
    }

    public String getInfo() {
        return String.format("Class \u001B[33m Crossbowman \u001B[37m \t:::\t %s", super.getInfo());
    }

    public int getRangeDamage() {
        return rangeDamage;
    }
    public void setRangeDamage(int rangeDamage) {
        this.rangeDamage = rangeDamage;
    }
}
