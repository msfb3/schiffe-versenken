package de.breitling;

import java.util.Scanner;

public class Main {

    private  static char[][] game = new char[10][10];
    private static Scanner scanner = new Scanner(System.in);
    private static int programmCounter = 0;
    private static int shipCounter = 7;
    private static int fiveShipCounter = 1;
    private static int fourShipCounter = 2;
    private static int threeShipCounter = 3;
    private static int twoShipCounter = 1;
    private static int shipSelector;
    private static int alignmentSelector;

    public static void main(String[] args) {
        System.out.println("Wilkommen bei Schiffe versenken.");
    }
    public static void printGame() {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                char ship = game[row][col];
            }
        }
    }
    public static boolean placeShip() {
        while (shipCounter !=0) {
            System.out.println("Bitte setze dein Schiff");
            System.out.println("Welche Schiffgröße möchtest du setzen? 2, 3, 4, 5");
            shipSelector = scanner.nextInt();
            System.out.println("Welche Ausrichtung soll das Schiff haben? (1.Waagrecht, 2.Senkrecht)");
            alignmentSelector = scanner.nextInt();

            switch (shipSelector) {
                case 2:
                    shipCounter--;
                    twoShipCounter--;
                    break;
                case 3:
                    shipCounter--;
                    threeShipCounter--;
                    break;
                case 4:
                    shipCounter--;
                    fourShipCounter--;
                    break;
                case 5:
                    shipCounter--;
                    fiveShipCounter--;
                    break;
            }
        }




        return true;
    }
}
