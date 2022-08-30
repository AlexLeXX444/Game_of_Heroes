package game;

public class Rogue extends BaseHero{
    /**
     *Args of class:
     * @param name
     * @param healPoint
     * @param damage
     * @param damage
     * @param attack - ranged
     * @param defence
     * @param speed
     */
    public Rogue(String name, int healPoint, int damage, int[] attack, int defence, int speed) {
        super(name, healPoint, damage, attack, defence, speed);
    }

    public Rogue(int healPoint, int damage, int[] attack, int defence, int speed) {
        super("rogue", healPoint, damage, attack, defence, speed);
    }

    public String getInfo() {
        return String.format("Class \u001B[31m Rogue \u001B[37m \t:::\t %s", super.getInfo());
    }
}
