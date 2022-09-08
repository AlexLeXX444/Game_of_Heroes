package game;

import game.Heroes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BaseHero hero1 = new Crossbowman("White", 1,5);
        System.out.println(hero1.getInfo());
    }

    public static void PrintAll (ArrayList<BaseHero> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getInfo());
        }
    }

}