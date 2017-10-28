package battleship;
import java.util.Random;
import java.util.Scanner;

public class BattleShipsGame {

    private static String header = "    0123456789";
    private static String footer = "    0123456789";
    private static int[][] map = new int[10][10];

    public static void main(String[] args) {
        System.out.println("**** Welcome to the Battleships Game ****\n\n");

        int i = 0;
        Scanner input = new Scanner(System.in);

        while (i < 5) {
            System.out.print("Enter X coordinate for your ship: ");
            int x = input.nextInt();
            System.out.print("Enter Y coordinate for your ship: ");
            int y = input.nextInt();

            // The player should not enter a coordinate that's already in use.
            if (map[x][y] == 1) {
                System.out.println("\nCoordinate has already been used.");
                continue;
            } else {
                map[x][y] = 1;
            }
            i++;
        }

        System.out.println();

        oceanMap();
    }

    // Prints the grid to the screen.
    public static void oceanMap() {

        System.out.println(header);
        int i;
        int j;

        for (i = 0; i < map.length; i++) {
            System.out.print(" " + i + " |");

            for (j = 0; j < map[i].length; j++) {
                if (map[i][j] == 0) {
                    System.out.print(" ");
                } else if (map[i][j] == 1){
                    System.out.print("@");
                }
            }
            System.out.print("| " + i);
            System.out.println();
        }

        System.out.println(footer + "\n");
        deployShips();
    }

    // Make random numbers for the computer's grid coordinates
    private static int genCoordinate(){
        // Upper and lower bounds for computer's coordinates
        int min = 0;
        int max = 9;
        int number;

        Random rand = new Random();
        return number = rand.nextInt(max - min + 1) + min;
    }

    // Place computer's ships on the grid.
    private static void deployShips() {

        System.out.println("Computer is deploying ships");
        int i = 0;
        int x, y;

        while (i < 5) {
            x = genCoordinate();
            y = genCoordinate();

            if (map[x][y] == 0) {
                map[x][y] = 2;
                System.out.println(i + 1 + ". ship DEPLOYED");
                i++;
            } else {
                continue;
            }
        }

        System.out.println(i + 1 + "----------------------");
    }
}
