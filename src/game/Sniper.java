package game;

public class Sniper extends BaseHero{
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
    public Sniper(String name, int healPoint, int damage, int[] attack, int defence, int speed, int rangeDamage) {
        super(name, healPoint, damage, attack, defence, speed);
        this.rangeDamage = rangeDamage;
    }

    public Sniper(int healPoint, int damage, int[] attack, int defence, int speed, int rangeDamage) {
        super("sniper", healPoint, damage, attack, defence, speed);
        this.rangeDamage = rangeDamage;
    }

    public String getInfo() {
        return String.format("Class Sniper ::: %s", super.getInfo());
    }
}
