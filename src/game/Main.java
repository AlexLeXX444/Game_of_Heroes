package game;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int partySize = 5;

        ArrayList<BaseHero> commandPeasants = fillCommandHeroes("Peasant", partySize);
        PrintAll(commandPeasants);

        ArrayList<BaseHero> commandRogue = fillCommandHeroes("Rogue", partySize);
        PrintAll(commandRogue);

        ArrayList<BaseHero> commandSniper = fillCommandHeroes("Sniper", partySize);
        PrintAll(commandSniper);

        ArrayList<BaseHero> commandWizard = fillCommandHeroes("Wizard", partySize);
        PrintAll(commandWizard);

        ArrayList<BaseHero> commandSpearman = fillCommandHeroes("Spearman", partySize);
        PrintAll(commandSpearman);

        ArrayList<BaseHero> commandCrossbowman = fillCommandHeroes("Crossbowman", partySize);
        PrintAll(commandCrossbowman);

        ArrayList<BaseHero> commandMonk = fillCommandHeroes("Monk", partySize);
        PrintAll(commandMonk);

/*
        System.out.println(commandWizard.get(0).getCondition());
        commandWizard.get(0).getDamage(commandSniper.get(0).dealDamage());
        System.out.println(commandWizard.get(0).getCondition());
*/

    }

    /**
     * Fill party of heroes.
     * @param className - Peasant, Rogue, Sniper, Wizard, Spearman, Crossbowman, Monk.
     * @param partySize - int num of party members.
     * @return ArrayList<> of party.
     */
    public static ArrayList<BaseHero> fillCommandHeroes(String className, int partySize) {
        ArrayList<BaseHero> list = new ArrayList<>();
        int counter = 1;
        switch (className) {
            case "Peasant":
                while (list.size() < partySize) {
                    list.add(new Peasant(
                            String.format("peasant %d", counter),
                            1,
                            1,
                            new int[]{1, 1},
                            0,
                            3));
                    counter++;
                }
                return list;
            case "Rogue":
                while (list.size() < partySize) {
                    list.add(new Rogue(
                            String.format("rogue %d", counter),
                            10,
                            8,
                            new int[] {2, 4},
                            3,
                            6));
                    counter++;
                }
                return list;
            case "Sniper":
                while (list.size() < partySize) {
                    list.add(new Sniper(
                            String.format("sniper %d", counter),
                            15,
                            12,
                            new int[] {8, 10},
                            10,
                            9,
                            32));
                    counter++;
                }
                return list;
            case "Wizard":
                while (list.size() < partySize) {
                    list.add(new Wizard(
                            String.format("wizard %d", counter),
                            30,
                            17,
                            new int[] {-5, -5},
                            12,
                            9));
                    counter++;
                }
                return list;
            case "Spearman":
                while (list.size() < partySize) {
                    list.add(new Spearman(
                            String.format("spearman %d", counter),
                            10,
                            4,
                            new int[] {1, 3},
                            5,
                            4));
                    counter++;
                }
                return list;
            case "Crossbowman":
                while (list.size() < partySize) {
                    list.add(new Crossbowman(
                            String.format("crossbowman %d", counter),
                            10,
                            12,
                            new int[] {2, 3},
                            3,
                            1,
                            16));
                    counter++;
                }
                return list;
            case "Monk":
                while (list.size() < partySize) {
                    list.add(new Monk(
                            String.format("monk %d", counter),
                            30,
                            12,
                            new int[] {-4, -4},
                            7,
                            5));
                    counter++;
                }
                return list;
            case default:
                return list;
        }
    }


    public static void PrintAll (ArrayList<BaseHero> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getInfo());
        }
    }

}