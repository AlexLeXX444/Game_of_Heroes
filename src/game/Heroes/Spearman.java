package game.Heroes;

public class Spearman extends BaseHero{
    public Spearman() {
        super(
                "spearman",
                10,
                4,
                new int[] {1, 3},
                5,
                4
        );
    }

    public String getInfo() { return String.format("Class \u001B[36m Spearman \u001B[37m \t:::\t %s", super.getInfo()); }
}
