package game;

public class Wizard extends BaseHero{
    private boolean magic;

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
        this.magic = true;
    }

    public Wizard(int healPoint, int damage, int[] attack, int defence, int speed) {
        super("wizard", healPoint, damage, attack, defence, speed);
        this.magic = true;
    }

    public String getInfo() {
        return String.format("Class \u001B[34m Wizard \u001B[37m \t:::\t %s", super.getInfo());
    }

    public void setMagic(boolean magic) {
        this.magic = magic;
    }
    public boolean getMagic() {
        return this.magic;
    }
}
