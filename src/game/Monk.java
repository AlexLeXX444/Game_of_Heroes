package game;

public class Monk extends BaseHero{
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
    public Monk(String name, int healPoint, int damage, int[] attack, int defence, int speed) {
        super(name, healPoint, damage, attack, defence, speed);
        this.magic = true;
    }

    public Monk(int healPoint, int damage, int[] attack, int defence, int speed) {
        super("Monk", healPoint, damage, attack, defence, speed);
        this.magic = true;
    }

    public String getInfo() {
        return String.format("Class \u001B[32m monk \u001B[37m \t:::\t %s", super.getInfo());
    }

    public boolean getMagic() {
        return this.magic;
    }
    public void setMagic(boolean magic) {
        this.magic = magic;
    }
}
