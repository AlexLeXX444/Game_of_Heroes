package game.Interfaces;

import game.Heroes.BaseHero;

public interface BoardField {
    int[] getCords();
    BaseHero getHero();
    void fillCage(BaseHero hero, int[] cords);
}
