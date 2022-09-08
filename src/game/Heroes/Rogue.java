package game.Heroes;

public class Rogue extends BaseHero{
    public Rogue() {
        super(
                "rogue",
                10,
                8,
                new int[] {2, 4},
                3,
                6
        );
    }

    public String getInfo() { return String.format("Class \u001B[31m Rogue \u001B[37m \t:::\t %s", super.getInfo()); }
}
