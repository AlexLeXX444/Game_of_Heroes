package game.Board;

import game.Heroes.BaseHero;
import game.Heroes.Shadow;
import game.Interfaces.BoardField;

public abstract class BasedBoard implements BoardField {
    protected BaseHero hero;
    protected int[] cords;

    @Override
    public BaseHero getHero() { return hero; }

    @Override
    public int[] getCords() { return cords; }

    public BasedBoard(BaseHero hero, int[] cords) {
        if (hero.getStatus()) {
            this.hero = hero;
        } else {
            this.hero = new Shadow();
        }
        this.cords = cords;
    }

    public BasedBoard(int[] cords) {
        this(new Shadow(), cords);
    }
}
