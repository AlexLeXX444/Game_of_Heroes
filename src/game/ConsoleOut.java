package game;

import game.Board.*;
import game.Heroes.*;
import java.util.List;

public class ConsoleOut {


    public static void printField(List<Cell> celler) {
        if (!celler.isEmpty()) {
            int rows = celler.get(celler.size() - 1).getCords()[0];
            int columns = celler.get(celler.size() - 1).getCords()[1];

            for (int k = 1; k <= columns; k++) {
                System.out.print("+-----+");
            }
            System.out.println();
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= columns; j++) {
                    if (celler.get(i * j - 1).getHero().getCommandName() == "DarkSide") {
                        System.out.print("|  DS |");
                    } else if (celler.get(i * j - 1).getHero().getCommandName() == "WhiteSide") {
                        System.out.print("|  WS |");
                    } else {
                        System.out.print("|     |");
                    }
                }

                System.out.println();
                for (int j = 1; j <= rows; j++) {
                    if (celler.get(i * j - 1).getHero().getClass() == Crossbowman.class) System.out.print("| \u001B[33mCbm\u001B[37m |");
                    else if (celler.get(i * j - 1).getHero().getClass() == Monk.class) System.out.print("| \u001B[32mMnk\u001B[37m |");
                    else if (celler.get(i * j - 1).getHero().getClass() == Peasant.class) System.out.print("| \u001B[30mPsn\u001B[37m |");
                    else if (celler.get(i * j - 1).getHero().getClass() == Rogue.class) System.out.print("| \u001B[31mRog\u001B[37m |");
                    else if (celler.get(i * j - 1).getHero().getClass() == Sniper.class) System.out.print("| \u001B[35mSnp\u001B[37m |");
                    else if (celler.get(i * j - 1).getHero().getClass() == Spearman.class) System.out.print("| \u001B[36mSpr\u001B[37m |");
                    else if (celler.get(i * j - 1).getHero().getClass() == Wizard.class) System.out.print("| \u001B[34mWzd\u001B[37m |");
                    else System.out.printf("| %s |", celler.get(j).getName());
                }
                System.out.println();
                for (int k = 1; k <= rows; k++) {
                    System.out.print("+-----+");
                }
                System.out.println();
            }
        }
    }
}
