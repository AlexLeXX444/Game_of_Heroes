package game.Heroes;

public class Rogue extends BaseHero{
    public Rogue(String commandName, int posX, int posY) {
        super(
                commandName,
                "rogue",
                10,
                8,
                new int[] {2, 4},
                3,
                6,
                new int[] {posX, posY}
        );
    }

    public String getInfo() { return String.format("Class \u001B[31m Rogue \u001B[37m \t:::\t %s", super.getInfo()); }
}
