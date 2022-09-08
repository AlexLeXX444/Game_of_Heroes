package game.Heroes;

public class Wizard extends BaseHero{
    private boolean magic;

    public Wizard() {
        super(
                "wizard",
                30,
                17,
                new int[] {-5, -5},
                12,
                9
        );
        this.magic = true;
    }

    public String getInfo() { return String.format("Class \u001B[34m Wizard \u001B[37m \t:::\t %s", super.getInfo()); }
}
