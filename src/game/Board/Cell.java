package game.Board;

import game.Heroes.BaseHero;
import game.Heroes.Shadow;

public class Cell extends BasedBoard{
    private final String name;

    public Cell(String name, BaseHero hero, int[] cords) {
        super(hero, cords);
        this.name = name;
    }

    public Cell(String name, int[] cords) {
        this(name, new Shadow(), cords);
    }

    @Override
    public void fillCage(BaseHero hero, int[] cords) {
        super.hero = hero;
        super.cords = cords;
    }

    public void fillCage(int[] cords) {
        super.hero = new Shadow();
        super.cords = cords;
    }

    public String getName() {
        return name;
    }
}
