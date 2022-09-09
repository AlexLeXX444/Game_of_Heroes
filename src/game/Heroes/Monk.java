package game.Heroes;

public class Monk extends BaseHero{
    private boolean magic;

    public Monk(String commandName, int posX, int posY) {
        super(
                commandName,
                "monk",
                30,
                12,
                new int[] {-4, -4},
                7,
                5,
                new int[] {posX, posY}
        );
        this.magic = true;
    }

    public String getInfo() { return String.format("Class\u001B[32m %-11s \u001B[37m::\t %s", "Monk", super.getInfo()); }
}
