package game;

import game.Heroes.*;
import game.Board.*;
import java.util.*;
import static game.ConsoleOut.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("\u001B[37m");
        int boardLenght = 5;
        List<Cell> myBoard = new ArrayList<>();

        for (int i = 1; i <= boardLenght; i++) {
           for (int j = 1; j <= boardLenght; j++) {
               myBoard.add(new Cell(String.format("%d-%d", i, j), new int[]{i, j}));
           }
        }


        int step = 0;
        String stepTeam = "DarkSide";
        List<BaseHero> darkSide = new ArrayList<>();
        List<BaseHero> whiteSide = new ArrayList<>();

        darkSide.add(new Peasant("DarkSide", 0,0));
        darkSide.add(new Rogue("DarkSide", 0,0));
        darkSide.add(new Sniper("DarkSide", 0,0));
        darkSide.add(new Wizard("DarkSide", 0,0));
        Random rnd = new Random();
        for (int i = 0; i < boardLenght - 4; i++) {
            switch (rnd.nextInt(4)) {
                case 0 -> darkSide.add(new Peasant("DarkSide", 0, 0));
                case 1 -> darkSide.add(new Rogue("DarkSide", 0, 0));
                case 2 -> darkSide.add(new Sniper("DarkSide", 0, 0));
                default -> darkSide.add(new Wizard("DarkSide", 0, 0));
            }
        }

        for (int i = 0, j = 0; j < darkSide.size(); i += boardLenght, j++) {
            myBoard.get(i).fillCage(darkSide.get(j));
        }

        whiteSide.add(new Peasant("WhiteSide", 0,0));
        whiteSide.add(new Monk("WhiteSide", 0,0));
        whiteSide.add(new Crossbowman("WhiteSide", 0,0));
        whiteSide.add(new Spearman("WhiteSide", 0,0));
        for (int i = 0; i < boardLenght - 4; i++) {
            switch (rnd.nextInt(4)) {
                case 0 -> whiteSide.add(new Peasant("WhiteSide", 0, 0));
                case 1 -> whiteSide.add(new Monk("WhiteSide", 0, 0));
                case 2 -> whiteSide.add(new Crossbowman("WhiteSide", 0, 0));
                default -> whiteSide.add(new Spearman("WhiteSide", 0, 0));
            }
        }

        for (int i = boardLenght - 1, j = 0; j < whiteSide.size(); i += boardLenght, j++) {
            myBoard.get(i).fillCage(whiteSide.get(j));
        }

        printCommandsList(darkSide, whiteSide);
        System.out.println("МЕНЮ : q , quit - выход; n , next - для старта;");

        if (rnd.nextInt(2) == 0) { stepTeam = "WhiteSide"; }
        Scanner in = new Scanner(System.in);

        while (true) {
            int action = 1;
            String whosTurn;

            String txtCommand = in.nextLine();

            if (isKilledAll(darkSide)) {
                System.out.println("White side WINNER !!!");
                break;
            }
            if (isKilledAll(whiteSide)) {
                System.out.println("Dark side WINNER !!!");
                break;
            }

            if (txtCommand.equals("q") || txtCommand.equals("quit")) { break; }

            if (txtCommand.equals("n") || txtCommand.equals("next")){
                step++;
                printHeader(step);
                if (stepTeam.equals("WhiteSide")) {
                    stepTeam = "DarkSide";
                } else {
                    stepTeam = "WhiteSide";
                }
                if (stepTeam.equals("WhiteSide")) { whosTurn = "\u001B[31m>>>\u001B[37mWhite side\u001B[31m<<<\u001B[37m"; }
                else { whosTurn = "\u001B[31m>>>\u001B[37mDark side\u001B[31m<<<\u001B[37m"; }
                System.out.println(whosTurn);
                printField(myBoard);
            }

            if (txtCommand.equals("c") || txtCommand.equals("chose")){
                while (action > 0) {
                    boolean whatHeroStand = false;
                    System.out.println("Введите координаты ячейки с Вашим героем через ТИРЕ (линия-колонка);");
                    String txtCords = in.nextLine();
                    int indexOfCell = searchIndexCell(myBoard, txtCords);
                    if (indexOfCell >= 0) {
                        if (Objects.equals(myBoard.get(indexOfCell).getHero().getCommandName(), stepTeam)) {
                            whatHeroStand = true;
                        }
                    }
                    while (!cordsSearch(myBoard, txtCords) || !whatHeroStand) {
                        System.out.println("Введите верные координаты ячейки с Вашим героем через ТИРЕ (например 5-8);");
                        txtCords = in.nextLine();
                        indexOfCell = searchIndexCell(myBoard, txtCords);
                        if (indexOfCell > 0) {
                            if (Objects.equals(myBoard.get(indexOfCell).getHero().getCommandName(), stepTeam)) {

                                whatHeroStand = true;
                            }
                        }
                    }
                    int indexAttackHeroCell = indexOfCell;

                    System.out.println("Выберете координаты ячейки куда будете ходить из доступных;");
                    int[] whereCanGo = searchIndexToGo(myBoard, indexAttackHeroCell);
                    for (int canGo : whereCanGo) {
                        if (canGo >= 0) {
                            System.out.println(myBoard.get(canGo).getName());
                        }
                    }

                    txtCords = in.nextLine();
                    indexOfCell = searchIndexCell(myBoard, txtCords);
                    int finalIndexOfCell = indexOfCell;
                    boolean found = Arrays.stream(whereCanGo).anyMatch(x -> x == finalIndexOfCell);
                    while (!found) {
                        System.out.println("Введите верные координаты ячейки куда будете ходить из доступных;");
                        txtCords = in.nextLine();
                        indexOfCell = searchIndexCell(myBoard, txtCords);
                        int finalIndexOfCell2 = indexOfCell;
                        found = Arrays.stream(whereCanGo).anyMatch(x -> x == finalIndexOfCell2);
                    }
                    int indexAttackedHeroCell = indexOfCell;

                    if (myBoard.get(indexAttackedHeroCell).getHero().getClass() == Shadow.class) {
                        myBoard.get(indexAttackedHeroCell).fillCage(myBoard.get(indexAttackHeroCell).getHero());
                        myBoard.get(indexAttackHeroCell).fillCage(new Shadow());
                    } else {
                        if (Objects.equals(myBoard.get(indexAttackedHeroCell).getHero().getCommandName(), stepTeam)) {
                            if (myBoard.get(indexAttackHeroCell).getHero().getClass() == Wizard.class ||
                                    myBoard.get(indexAttackHeroCell).getHero().getClass() == Monk.class) {
                                myBoard.get(indexAttackedHeroCell).fillCage(healHero(myBoard.get(indexAttackHeroCell).getHero(), myBoard.get(indexAttackedHeroCell).getHero()));
                            } else {
                                myBoard.get(indexAttackedHeroCell).fillCage(attackHero(myBoard.get(indexAttackHeroCell).getHero(), myBoard.get(indexAttackedHeroCell).getHero()));
                            }
                        }
                    }

                    action--;
                }
            }

            if (txtCommand.equals("p") || txtCommand.equals("print")) {
                printCommandsList(darkSide, whiteSide);
            }


            System.out.println("МЕНЮ : q , quit - выход; n , next - для старта; p , print - вывести списки команд;");
            System.out.println("c, chose - координаты ячейки с Вашим героем через ТИРЕ (линия-колонка);");
            System.out.println("Действий осталось: " + action);
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

    public static boolean isKilledAll (List<BaseHero> list) {
        int counter = 0;
        for (BaseHero baseHero : list) {
            if (!baseHero.getStatus()) {
                counter++;
            }
        }
        return counter == list.size();
    }

    public static boolean cordsSearch (List<Cell> board, String str) {
        for (Cell cell : board) {
            if (cell.getName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static int searchIndexCell (List<Cell> board, String cords) {
        for (int i = 0; i < board.size(); i++) {
            if (board.get(i).getName().equals(cords)) {
                return i;
            }
        }
        return -1;
    }

    public static int[] searchIndexToGo (List<Cell> board, int startIndex) {
        int cordX = board.get(startIndex).getCords()[0];
        int cordY = board.get(startIndex).getCords()[1];
        int maxCordX = board.get(board.size() - 1).getCords()[0];
        int maxCordY = board.get(board.size() - 1).getCords()[1];
        int[] indexes = new int[] {-1, -1, -1, -1};

        if (cordX + 1 > 0 && cordX + 1 <= maxCordX) {
            indexes[0] = searchIndexCell(board, String.format("%d-%d", cordX + 1, cordY));
        }
        if (cordX - 1 > 0 && cordX - 1 <= maxCordX) {
            indexes[1] = searchIndexCell(board, String.format("%d-%d", cordX - 1, cordY));
        }
        if (cordY + 1 > 0 && cordY + 1 <= maxCordY) {
            indexes[2] = searchIndexCell(board, String.format("%d-%d", cordX, cordY + 1));
        }
        if (cordY - 1 > 0 && cordY - 1 <= maxCordY) {
            indexes[3] = searchIndexCell(board, String.format("%d-%d", cordX, cordY - 1));
        }

        return indexes;
    }
}