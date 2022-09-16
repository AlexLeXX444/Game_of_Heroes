package game;

import game.Heroes.*;
import game.Board.*;
import java.util.*;
import static game.ConsoleOut.printField;

public class Main {
    public static void main(String[] args) {
        System.out.print("\u001B[37m");
        int boardLenght = 10, boardHeigth = 10;
        List<Cell> myBoard = new ArrayList<>();

        for (int i = 1; i <= boardLenght; i++) {
           for (int j = 1; j <= boardHeigth; j++) {
               myBoard.add(new Cell(String.format("%s-%s", i, j), new int[]{i, j}));
           }
       }

        int step = 1;
        String stepTeam = "DarkSide";
        List<BaseHero> darkSide = new ArrayList<>();
        List<BaseHero> whiteSide = new ArrayList<>();

        darkSide.add(new Peasant("DarkSide", 0,0));
        darkSide.add(new Rogue("DarkSide", 0,0));
        darkSide.add(new Sniper("DarkSide", 0,0));
        darkSide.add(new Wizard("DarkSide", 0,0));
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)){
                case 0:
                    darkSide.add(new Peasant("DarkSide", 0,0));
                    break;
                case 1:
                    darkSide.add(new Rogue("DarkSide", 0,0));
                    break;
                case 2:
                    darkSide.add(new Sniper("DarkSide", 0,0));
                    break;
                default:
                    darkSide.add(new Wizard("DarkSide", 0,0));
            }
        }

        for (int i = 1; i <= boardLenght; i++) {
            for (int j = 1; j <= boardHeigth; j++) {

            }
        }

        whiteSide.add(new Peasant("WhiteSide", 0,0));
        whiteSide.add(new Monk("WhiteSide", 0,0));
        whiteSide.add(new Crossbowman("WhiteSide", 0,0));
        whiteSide.add(new Spearman("WhiteSide", 0,0));
        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)){
                case 0:
                    whiteSide.add(new Peasant("WhiteSide", 0,0));
                    break;
                case 1:
                    whiteSide.add(new Monk("WhiteSide", 0,0));
                    break;
                case 2:
                    whiteSide.add(new Crossbowman("WhiteSide", 0,0));
                    break;
                default:
                    whiteSide.add(new Spearman("WhiteSide", 0,0));
            }
        }

        System.out.printf("\u001B[37m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~{_________ Step %3s __________}~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n", step);
        System.out.println(String.format("%28s \t\t\t\t\t\t\t %36s", "Dark side", "White side"));

        for (int i = 0; i < darkSide.size(); i++) { System.out.println(darkSide.get(i).getInfo() + "\t{~~~}\t" + whiteSide.get(i).getInfo()); }
        System.out.println("МЕНЮ : q , quit - выход; n , next - передача хода;");

        if (rnd.nextInt(2) == 0) { stepTeam = "WhiteSide"; }
        Scanner in = new Scanner(System.in);
        while (true) {
            String whosTurn;
            if (stepTeam == "WhiteSide") { whosTurn = "\u001B[31m>>>\u001B[37mWhite side\u001B[31m<<<\u001B[37m"; }
            else { whosTurn = "\u001B[31m>>>\u001B[37mDark side\u001B[31m<<<\u001B[37m"; }

            String txtCommand = in.nextLine();
            if (txtCommand.equals("q") || txtCommand.equals("quit")) { break; }
            if (txtCommand.equals("n") || txtCommand.equals("next")){
                step++;
                System.out.printf("\u001B[37m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~{_________ Step %3s __________}~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n", step);
                System.out.println(whosTurn);
                BaseHero attackHero, attackedHero;

                if (stepTeam == "WhiteSide") {
                    attackHero = choseHero(whiteSide);
                    if (attackHero.getClass() == Monk.class || attackHero.getClass() == Wizard.class) {
                        attackedHero = choseHero(whiteSide);
                        healHero(attackHero, attackedHero);
                    } else {
                        attackedHero = choseHero(darkSide);
                        attackHero(attackHero, attackedHero);
                    }
                    stepTeam = "DarkSide";
                } else {
                    attackHero = choseHero(darkSide);
                    if (attackHero.getClass() == Monk.class || attackHero.getClass() == Wizard.class) {
                        attackedHero = choseHero(darkSide);
                        healHero(attackHero, attackedHero);
                    } else {
                        attackedHero = choseHero(whiteSide);
                        attackHero(attackHero, attackedHero);
                    }
                    stepTeam = "WhiteSide";
                }

                System.out.println(String.format("%s  :::  %s \n", attackHero.getInfo(), attackedHero.getInfo()));

                for (int i = 0; i < darkSide.size(); i++) { System.out.println(darkSide.get(i).getInfo() + "\t:\t" + whiteSide.get(i).getInfo()); }

                if (isKilledAll(darkSide)) {
                    System.out.println("White side WINNER !!!");
                    break;
                }
                if (isKilledAll(whiteSide)) {
                    System.out.println("Dark side WINNER !!!");
                    break;
                }
                System.out.println();
                printField(myBoard, boardLenght, boardHeigth);
                System.out.println("МЕНЮ : q , quit - выход; n , next - передача хода;");
            }
        }


    }

    public static BaseHero attackHero (BaseHero dealDamageHero, BaseHero getDamageHero) {
        getDamageHero.getDamage(dealDamageHero.dealDamage());
        return getDamageHero;
    }

    public static BaseHero healHero (BaseHero dealHealingHero, BaseHero getDamageHero) {
        getDamageHero.getDamage(dealHealingHero.dealHealing());
        return getDamageHero;
    }

    public static BaseHero choseHero (List<BaseHero> list) {
        Random rnd = new Random();
        int numOfHero = rnd.nextInt(10);
        while (list.get(numOfHero).getStatus() == false) {
            numOfHero = rnd.nextInt(10);
        }
        return list.get(numOfHero);
    }

    public static boolean isKilledAll (List<BaseHero> list) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStatus() == false) {
                counter++;
            }
        }
        if (counter == list.size()) {
            return true;
        } else {
            return false;
        }
    }
}