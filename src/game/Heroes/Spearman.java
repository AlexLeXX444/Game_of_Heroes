package game.Heroes;

public class Spearman extends BaseHero{
    public Spearman(String commandName, int posX, int posY) {
        super(
                commandName,
                "spearman",
                10,
                4,
                new int[] {1, 3},
                5,
                4,
                new int[] {posX, posY}
        );
    }

    public String getInfo() { return String.format("Class \u001B[36m Spearman \u001B[37m \t:::\t %s", super.getInfo()); }
}
