package game.Heroes;

public class Sniper extends BaseHero{
    private int rangeDamage;

    public Sniper(String commandName, int posX, int posY) {
        super(
                commandName,
                "sniper",
                15,
                12,
                new int[] {8, 10},
                10,
                9,
                new int[] {posX, posY}
        );
        this.rangeDamage = 32;
    }

    public String getInfo() { return String.format("Class \u001B[35m Sniper \u001B[37m \t:::\t %s", super.getInfo()); }
}
