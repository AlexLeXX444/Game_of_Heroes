package game;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int partySize = 5;

        int counter = 1;
        ArrayList<BaseHero> commandPeasants = new ArrayList<>();
        while (commandPeasants.size() < partySize) {
            commandPeasants.add(new Peasant(
                    String.format("peasant %d", counter),
                    1,
                    1,
                    new int[] {1, 1},
                    0,
                    3));
            counter++;
        }
        PrintAll(commandPeasants);

        counter = 1;
        ArrayList<BaseHero> commandRogue = new ArrayList<>();
        while (commandRogue.size() < partySize) {
            commandRogue.add(new Rogue(
                    String.format("rogue %d", counter),
                    10,
                    8,
                    new int[] {2, 4},
                    3,
                    6));
            counter++;
        }
        PrintAll(commandRogue);

        counter = 1;
        ArrayList<BaseHero> commandSniper = new ArrayList<>();
        while (commandSniper.size() < partySize) {
            commandSniper.add(new Sniper(
                    String.format("sniper %d", counter),
                    15,
                    12,
                    new int[] {8, 10},
                    10,
                    9,
                    32));
            counter++;
        }
        PrintAll(commandSniper);

        counter = 1;
        ArrayList<BaseHero> commandWizard = new ArrayList<>();
        while (commandWizard.size() < partySize) {
            commandWizard.add(new Wizard(
                    String.format("wizard %d", counter),
                    30,
                    17,
                    new int[] {-5, -5},
                    12,
                    9));
            counter++;
        }
        PrintAll(commandWizard);

        counter = 1;
        ArrayList<BaseHero> commandSpearman = new ArrayList<>();
        while (commandSpearman.size() < partySize) {
            commandSpearman.add(new Spearman(
                    String.format("spearman %d", counter),
                    10,
                    4,
                    new int[] {1, 3},
                    5,
                    4));
            counter++;
        }
        PrintAll(commandSpearman);

        counter = 1;
        ArrayList<BaseHero> commandCrossbowman = new ArrayList<>();
        while (commandCrossbowman.size() < partySize) {
            commandCrossbowman.add(new Crossbowman(
                    String.format("crossbowman %d", counter),
                    10,
                    12,
                    new int[] {2, 3},
                    3,
                    1,
                    16));
            counter++;
        }
        PrintAll(commandCrossbowman);

        counter = 1;
        ArrayList<BaseHero> commandMonk = new ArrayList<>();
        while (commandMonk.size() < partySize) {
            commandMonk.add(new Monk(
                    String.format("monk %d", counter),
                    30,
                    12,
                    new int[] {-4, -4},
                    7,
                    5));
            counter++;
        }
        PrintAll(commandMonk);

/*
        System.out.println(commandWizard.get(0).getCondition());
        commandWizard.get(0).getDamage(commandSniper.get(0).dealDamage());
        System.out.println(commandWizard.get(0).getCondition());
*/

    }
/*
    public static ArrayList<BaseHero> (String className, partyCount) {

    }

 */
    public static void PrintAll (ArrayList<BaseHero> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getInfo());
        }
    }

}