package game.Heroes;

public class Shadow extends BaseHero{
    public Shadow() {
        super(
                "Shadow",
                "shadow",
                0,
                0,
                new int[] {0, 0},
                0,
                0,
                new int[] {0, 0}
        );
    }

    public String getShortClassName() { return "   "; }
}
