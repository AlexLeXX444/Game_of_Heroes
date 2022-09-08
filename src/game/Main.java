package game;

import game.Heroes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    public static void PrintAll (ArrayList<BaseHero> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getInfo());
        }
    }

}