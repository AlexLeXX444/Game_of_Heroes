package game;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //BaseHero hero1 = new BaseHero("pere", 100, 10, new int[]{2, 5}, 11, 11);
        //System.out.println(hero1.getInfo());
        //Peasant heroBrin = new Peasant( 1, 1, new int[] {1, 1}, 0, 3);
        //System.out.println(heroBrin.getInfo());
        //Rogue rog1 = new Rogue("Roga1", 10, 8, new int[] {2, 4}, 3, 6);
        //System.out.println(rog1.getInfo());
        //Sniper snip1 = new Sniper("Snip One", 15, 12, new int[] {8, 10}, 10, 9, 32);
        //System.out.println(snip1.getInfo());
        //Wizard mag1 = new Wizard("Mage One", 30, 17, new int[] {-5, -5}, 12, 9);
        //System.out.println(mag1.getInfo());
        //Sperman sp1 = new Sperman("Spearmn One", 10, 4, new int[] {1, 3}, 5, 4);
        //System.out.println(sp1.getInfo());
        //Crossbowman cs1 = new Crossbowman("Csmas One", 10, 12, new int[] {2, 3}, 3, 4, 16);
        //System.out.println(cs1.getInfo());
        //Monk mk1 = new Monk( 30, 12, new int[] {-4, -4}, 7, 5);
        //System.out.println(mk1.getInfo());

        ArrayList<String> commandPeasants = new ArrayList<>();
        int counter = 1;
        while (commandPeasants.size() < 5) {
            commandPeasants.add(new Peasant(
                    String.format("peasant %d", counter),
                    1,
                    1,
                    new int[] {1, 1},
                    0,
                    3)
                    .getInfo());
            counter++;
        }
        printHeroes(commandPeasants);
        System.out.println();

        ArrayList<String> commandRogue = new ArrayList<>();
        counter = 1;
        while (commandRogue.size() < 5) {
            commandRogue.add(new Rogue(
                    String.format("rogue %d", counter),
                    10,
                    8,
                    new int[] {2, 4},
                    3,
                    6)
                    .getInfo());
            counter++;
        }
        printHeroes(commandRogue);
        System.out.println();

        ArrayList<String> commandSniper = new ArrayList<>();
        counter = 1;
        while (commandSniper.size() < 5) {
            commandSniper.add(new Sniper(
                    String.format("sniper %d", counter),
                    15,
                    12,
                    new int[] {8, 10},
                    10,
                    9,
                    32)
                    .getInfo());
            counter++;
        }
        printHeroes(commandSniper);
        System.out.println();

        ArrayList<String> commandWizard = new ArrayList<>();
        counter = 1;
        while (commandWizard.size() < 5) {
            commandWizard.add(new Wizard(
                    String.format("wizard %d", counter),
                    30,
                    17,
                    new int[] {-5, -5},
                    12,
                    9)
                    .getInfo());
            counter++;
        }
        printHeroes(commandWizard);
        System.out.println();

        ArrayList<String> commandSpearman = new ArrayList<>();
        counter = 1;
        while (commandSpearman.size() < 5) {
            commandSpearman.add(new Sperman(
                    String.format("spearman %d", counter),
                    10,
                    4,
                    new int[] {1, 3},
                    5,
                    4)
                    .getInfo());
            counter++;
        }
        printHeroes(commandSpearman);
        System.out.println();

        ArrayList<String> commandCrossbowman = new ArrayList<>();
        counter = 1;
        while (commandCrossbowman.size() < 5) {
            commandCrossbowman.add(new Crossbowman(
                    String.format("crossbowman %d", counter),
                    10,
                    12,
                    new int[] {2, 3},
                    3,
                    1,
                    16)
                    .getInfo());
            counter++;
        }
        printHeroes(commandCrossbowman);
        System.out.println();

        ArrayList<String> commandMonk = new ArrayList<>();
        counter = 1;
        while (commandMonk.size() < 5) {
            commandMonk.add(new Monk(
                    String.format("monk %d", counter),
                    30,
                    12,
                    new int[] {-4, -4},
                    7,
                    5)
                    .getInfo());
            counter++;
        }
        printHeroes(commandMonk);
        System.out.println();
    }

    public static void printHeroes(ArrayList<String> heroes) {
        for(int i = 0; i < heroes.size(); i++) {
            System.out.println(heroes.get(i));
        }
    }
}