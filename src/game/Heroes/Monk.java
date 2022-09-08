package game.Heroes;

public class Monk extends BaseHero{
    private boolean magic;

    public Monk() {
        super(
                "monk",
                30,
                12,
                new int[] {-4, -4},
                7,
                5
        );
        this.magic = true;
    }

    public String getInfo() { return String.format("Class \u001B[32m monk \u001B[37m \t:::\t %s", super.getInfo()); }
}
