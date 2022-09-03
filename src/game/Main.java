package game;

import java.util.ArrayList;

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

        ArrayList<String> commandPeasants = fillClassParty("Peasant", 5);
        printHeroes(commandPeasants);

        ArrayList<String> commandRogue = fillClassParty("Rogue", 5);
        printHeroes(commandRogue);

        ArrayList<String> commandSniper = fillClassParty("Sniper", 5);
        printHeroes(commandSniper);

        ArrayList<String> commandWizard = fillClassParty("Wizard", 5);
        printHeroes(commandWizard);

        ArrayList<String> commandSpearman = fillClassParty("Spearman", 5);
        printHeroes(commandSpearman);

        ArrayList<String> commandCrossbowman = fillClassParty("Crossbowman", 5);
        printHeroes(commandCrossbowman);

        ArrayList<String> commandMonk = fillClassParty("Monk", 5);
        printHeroes(commandMonk);


    }

    /**
     * Fills a fixed-size command of one class.
     * @param className Peasant, Rogue, Sniper, Wizard, Spearman, Crossbowman, Monk.
     * @param partySize integer size of group.
     * @return ArrayList<String> of Classes.
     */
    public static ArrayList<String> fillClassParty (String className, int partySize) {
        ArrayList<String > party = new ArrayList<>();
        int counter = 1;
        switch (className){
            case "Peasant":
                while (party.size() < partySize) {
                    party.add(new Peasant(
                            String.format("peasant %d", counter),
                            1,
                            1,
                            new int[] {1, 1},
                            0,
                            3)
                            .getInfo());
                    counter++;
                }
                return party;
            case "Rogue":
                while (party.size() < partySize) {
                    party.add(new Rogue(
                            String.format("rogue %d", counter),
                            10,
                            8,
                            new int[] {2, 4},
                            3,
                            6)
                            .getInfo());
                    counter++;
                }
                return party;
            case "Sniper":
                while (party.size() < partySize) {
                    party.add(new Sniper(
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
                return party;
            case "Wizard":
                while (party.size() < partySize) {
                    party.add(new Wizard(
                            String.format("wizard %d", counter),
                            30,
                            17,
                            new int[] {-5, -5},
                            12,
                            9)
                            .getInfo());
                    counter++;
                }
                return party;
            case "Spearman":
                while (party.size() < partySize) {
                    party.add(new Spearman(
                            String.format("spearman %d", counter),
                            10,
                            4,
                            new int[] {1, 3},
                            5,
                            4)
                            .getInfo());
                    counter++;
                }
                return party;
            case "Crossbowman":
                while (party.size() < partySize) {
                    party.add(new Crossbowman(
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
                return party;
            case "Monk":
                while (party.size() < partySize) {
                    party.add(new Monk(
                            String.format("monk %d", counter),
                            30,
                            12,
                            new int[] {-4, -4},
                            7,
                            5)
                            .getInfo());
                    counter++;
                }
                return party;
            case default:
                party.add("none class " + className);
                return party;
        }
    }

    /**
     * Outputs the ArrayList of heroes to the console.
     * @param heroes input ArrayList<String>.
     */
    public static void printHeroes(ArrayList<String> heroes) {
        for(int i = 0; i < heroes.size(); i++) {
            System.out.println(heroes.get(i));
        }
        System.out.println();
    }
}