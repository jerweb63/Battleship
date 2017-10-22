package battleship;
import java.util.Scanner;

public class BattleShipsGame {

    private static String header = "    0123456789";
    private static String footer = "    0123456789";
    private static char[][] oceanMap = new char[10][10];

    public static void main(String[] args) {
        System.out.println("**** Welcome to the Battleships Game ****\n\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter X coordinate for your ship: ");
        int x = input.nextInt();
        System.out.print("Enter Y coordinate for your ship: ");
        int y = input.nextInt();
        System.out.println();
        seaMap();
    }

    public static void seaMap() {
        System.out.println(header);

        int i;
        int j;

        for (i = 0; i < oceanMap.length; i++) {
            System.out.print(" " + i + " |");

            for (j = 0; j < oceanMap[i].length; j++) {
                oceanMap[i][j] = ' ';
                System.out.print(oceanMap[i][j]);
            }
            System.out.print("| " + i);
            System.out.println();
        }

        System.out.println(footer);
    }
}
