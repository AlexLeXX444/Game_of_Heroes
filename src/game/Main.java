package game;

import game.Heroes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int step = 1;
        ArrayList<BaseHero> darkSide = fillCommand("Dark", 10);
        ArrayList<BaseHero> whiteSide = new ArrayList<BaseHero>();

        PrintAll(darkSide);

    }

    public static ArrayList<BaseHero> fillCommand (String commandName, int charNum) {
        ArrayList<BaseHero> list = new ArrayList<>();
        Random rnd = new Random();
        while (list.size() < charNum) {
            switch (rnd.nextInt(7)){
                case 0:
                    list.add(new Monk(commandName, 0,0));
                    break;
                case 1:
                    list.add(new Rogue(commandName, 0,0));
                    break;
                case 2:
                    list.add(new Sniper(commandName, 0,0));
                    break;
                case 3:
                    list.add(new Wizard(commandName, 0,0));
                    break;
                case 4:
                    list.add(new Spearman(commandName, 0,0));
                    break;
                case 5:
                    list.add(new Crossbowman(commandName, 0,0));
                    break;
                default:
                    list.add(new Peasant(commandName, 0,0));
            }
        }
        return list;
    }

    public static void PrintAll (ArrayList<BaseHero> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getInfo());
        }
    }

}