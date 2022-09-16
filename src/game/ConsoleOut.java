package game;

import game.Board.*;
import game.Heroes.*;
import java.util.List;

public class ConsoleOut {


    public static void printField(List<Cell> celler, int width, int height) {
        if (!celler.isEmpty()) {
            int counter1 = 0, counter2 = 0;
            for (int k = 1; k <= width; k++) {
                System.out.print("+-----+");
            }

            System.out.println();

            for (int i = 1; i <= width; i++) {
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

                for (int k = 1; k <= width; k++) {
                    System.out.print("+-----+");
                }

                System.out.println();
            }
        }
    }
}
