package game.Heroes;

public class Wizard extends BaseHero{
    private boolean magic;

    public Wizard(String commandName, int posX, int posY) {
        super(
                commandName,
                "wizard",
                30,
                17,
                new int[] {-5, -5},
                12,
                9,
                new int[] {posX, posY}
        );
        this.magic = true;
    }

    public String getInfo() { return String.format("Class \u001B[34m Wizard \u001B[37m \t:::\t %s", super.getInfo()); }
}
