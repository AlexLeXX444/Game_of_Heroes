package game.Heroes;

public class Crossbowman extends BaseHero{
    private int rangeDamage;

    public Crossbowman(String commandName, int posX, int posY) {
        super(
                commandName,
                "crossbowman",
                10,
                12,
                new int[] {2, 3},
                3,
                1,
                new int[] {posX, posY}
        );
        this.rangeDamage = 16;
    }

    public String getInfo() { return String.format("Class\u001B[33m %-11s \u001B[37m::\t %s", "Crossbowman", super.getInfo()); }
}
