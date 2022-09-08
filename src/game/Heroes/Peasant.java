package game.Heroes;

public class Peasant extends BaseHero {
    private boolean delivery;

    public Peasant(String commandName, int posX, int posY) {
        super(
                commandName,
                "peasant",
                1,
                1,
                new int[]{1, 1},
                0,
                3,
                new int[] {posX, posY}
        );
        this.delivery = true;
    }

    public String getInfo() { return String.format("Class \u001B[30m Peasant \u001B[37m \t:::\t %s", super.getInfo()); }
}
