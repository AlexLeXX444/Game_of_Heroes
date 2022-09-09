package game;

import game.Heroes.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int step = 1;
        String stepTeam = "DarkSide";
        ArrayList<BaseHero> darkSide = new ArrayList<>();
        ArrayList<BaseHero> whiteSide = new ArrayList<>();

        darkSide.add(new Peasant("darkSide", 0,0));
        darkSide.add(new Rogue("darkSide", 0,0));
        darkSide.add(new Sniper("darkSide", 0,0));
        darkSide.add(new Wizard("darkSide", 0,0));
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)){
                case 0:
                    darkSide.add(new Peasant("darkSide", 0,0));
                    break;
                case 1:
                    darkSide.add(new Rogue("darkSide", 0,0));
                    break;
                case 2:
                    darkSide.add(new Sniper("darkSide", 0,0));
                    break;
                default:
                    darkSide.add(new Wizard("darkSide", 0,0));
            }
        }

        whiteSide.add(new Peasant("whiteSide", 0,0));
        whiteSide.add(new Monk("whiteSide", 0,0));
        whiteSide.add(new Crossbowman("whiteSide", 0,0));
        whiteSide.add(new Spearman("whiteSide", 0,0));
        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)){
                case 0:
                    whiteSide.add(new Peasant("whiteSide", 0,0));
                    break;
                case 1:
                    whiteSide.add(new Monk("whiteSide", 0,0));
                    break;
                case 2:
                    whiteSide.add(new Crossbowman("whiteSide", 0,0));
                    break;
                default:
                    whiteSide.add(new Spearman("whiteSide", 0,0));
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
                rnd.nextInt(10);
                if (stepTeam == "WhiteSide") { attackHero(whiteSide.get(rnd.nextInt(10)), darkSide.get(rnd.nextInt(10))); }
                else { attackHero(darkSide.get(rnd.nextInt(10)), whiteSide.get(rnd.nextInt(10))); }
                for (int i = 0; i < darkSide.size(); i++) { System.out.println(darkSide.get(i).getInfo() + "\t:\t" + whiteSide.get(i).getInfo()); }
                if (stepTeam == "WhiteSide") { stepTeam = "DarkSide"; }
                else { stepTeam = "WhiteSide"; }
                System.out.println("МЕНЮ : q , quit - выход; n , next - передача хода;");
            }
        }
    }

    public static BaseHero attackHero (BaseHero dealDamageHero, BaseHero getDamageHero) {
        getDamageHero.getDamage(dealDamageHero.dealDamage());
        return getDamageHero;
    }
/*
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
*/
}