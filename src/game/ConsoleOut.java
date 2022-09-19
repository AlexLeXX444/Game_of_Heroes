package game;

import game.Board.*;
import game.Heroes.*;
import java.util.List;

public class ConsoleOut {

    public static void printHeader(int turn) {
        System.out.printf("\u001B[37m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~{_________ Step %3s __________}~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n", turn);
    }

    public static void printCommandsList (List<BaseHero> darkSide, List<BaseHero> whiteSide) {
        System.out.print("\u001B[37m~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~{___________КОМНДЫ____________}~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println(String.format("%28s \t\t\t\t\t\t\t %36s", "Dark side", "White side"));

        for (int i = 0; i < darkSide.size(); i++) {
            System.out.println(darkSide.get(i).getInfo() + "\t{~~~}\t" + whiteSide.get(i).getInfo());
        }
    }

    public static void printField (List<Cell> celler) {
        if (!celler.isEmpty()) {
            int counter1 = 0, counter2 = 0;
            int width = celler.get(celler.size() - 1).getCords()[0];
            int height = celler.get(celler.size() - 1).getCords()[1];

            System.out.print(" ");
            for (int k = 1; k <= width; k++) {
                if (k < 10) {
                    System.out.printf("+--%d--+", k);
                }
                else if (k >= 10 && k < 100) {
                    System.out.printf("+--%d-+", k);
                }
            }

            System.out.println();

            for (int i = 1; i <= width; i++) {
                if (i < 10) { System.out.printf(" %d", i); }
                else if (i >= 10 && i < 100) { System.out.printf("%d", i); }

                for (int j = 1; j <= height; j++) {
                    if (celler.get(counter1).getHero().getCommandName() == "DarkSide") {
                        System.out.print("|  DS |");
                    } else if (celler.get(counter1).getHero().getCommandName() == "WhiteSide") {
                        System.out.print("|  WS |");
                    } else {
                        System.out.print("|     |");
                    }
                    counter1++;
                }

                System.out.println();
                System.out.print("  ");

                for (int j = 1; j <= width; j++) {

                    if (celler.get(counter2).getHero().getClass() == Crossbowman.class) System.out.print("| \u001B[33mCbm\u001B[37m |");
                    else if (celler.get(counter2).getHero().getClass() == Monk.class) System.out.print("| \u001B[32mMnk\u001B[37m |");
                    else if (celler.get(counter2).getHero().getClass() == Peasant.class) System.out.print("| \u001B[30mPsn\u001B[37m |");
                    else if (celler.get(counter2).getHero().getClass() == Rogue.class) System.out.print("| \u001B[31mRog\u001B[37m |");
                    else if (celler.get(counter2).getHero().getClass() == Sniper.class) System.out.print("| \u001B[35mSnp\u001B[37m |");
                    else if (celler.get(counter2).getHero().getClass() == Spearman.class) System.out.print("| \u001B[36mSpr\u001B[37m |");
                    else if (celler.get(counter2).getHero().getClass() == Wizard.class) System.out.print("| \u001B[34mWzd\u001B[37m |");
                    else System.out.print("|     |");
                    counter2++;
                }

                System.out.println();
                System.out.print("  ");

                for (int k = 1; k <= width; k++) {
                    System.out.print("+-----+");
                }

                System.out.println();
            }
        }
    }
}
