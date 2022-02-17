package com.company.Homework3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ShipBattle {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("This is beautiful game Ship Battle");
        Thread.sleep(1000);
        System.out.println("Let's start ");
        Thread.sleep(1000);
        System.out.println("Please include coordinates !!");
        Thread.sleep(1000);
        System.out.println("Format including: type number 0-10 and press enter, do this action 2 time for X and Y coordinates ");
        int[][] battleBoard = createShipsInBoard(createShipsPoints());
        Thread.sleep(8000);
        String [][] emptyArray =createEmptyBoardAndShow();
        System.out.println("#############################################");

        String[][] resultBoard = checkCoordinates(includeCoordinates(),battleBoard, emptyArray);


        for (int i = 0; i < 100; i++) {
            if (finishCheck(resultBoard)) {
                checkCoordinates(includeCoordinates(), battleBoard, resultBoard);
            } else {
                System.out.println("FINISH!!!!");
                break;
            }
        }

    }

    public static String[][] createEmptyBoardAndShow() throws InterruptedException {
        String[][] emptyArray = new String[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0) {
                    emptyArray[i][j] = "" + j;
                } else if (j == 0) {
                    emptyArray[i][j] = "" + i;
                } else {
                    emptyArray[i][j] = "*";
                }
                Thread.sleep(100);
                System.out.print(emptyArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return emptyArray;

    }


    public static int[] createShipsPoints() {
        int ship6 = (int) (Math.random() * 11);
        int ship5_1 = (int) (Math.random() * 11);
        int ship5_2 = (int) (Math.random() * 11);
        int ship3_1 = (int) (Math.random() * 11);
        int ship3_2 = (int) (Math.random() * 11);


        int[] ships = new int[7];

        while ((ship6 == 0)) {
            ship6 = (int) (Math.random() * 11);
        }
        while ((ship5_2 == ship6) || (ship5_2 == 0) || (ship5_2 <= ship6 + 1 && ship5_2 >= ship6 - 1)) {
            ship5_2 = (int) (Math.random() * 11);
        }
        while (ship5_1 == ship6 || ship5_1 == ship5_2 || ship5_1 < 8) {
            ship5_1 = (int) (Math.random() * 11);
        }
        while (ship3_2 == ship6 || ship3_2 == ship5_2 || ship3_2 == ship5_1 || ship3_2 == 0 || ((ship3_2 <= ship6 + 1 && ship3_2 >= ship6 - 1) || (ship3_2 <= ship5_2 + 1 && ship3_2 >= ship5_2 - 1))) {
            ship3_2 = (int) (Math.random() * 11);
        }
        while (ship3_1 == ship6 || ship3_1 == ship5_2 || ship3_1 == ship3_2 || ship3_1 == 0
                || ((ship3_1 <= ship6 + 1 && ship3_1 >= ship6 - 1) || (ship3_1 <= ship5_2 + 1 && ship3_1 >= ship5_2 - 1) || (ship3_1 <= ship3_2 + 1 && ship3_1 >= ship3_2 - 1))) {
            ship3_1 = (int) (Math.random() * 11);
        }

        ships[0] = ship5_1;
        ships[1] = ship3_2;
        ships[2] = ship3_1;
        ships[3] = ship3_2;
        ships[4] = ship5_1;
        ships[5] = ship5_2;
        ships[6] = ship6;
        return ships;
    }

    public static int[][] createShipsInBoard(int[] ships) {
        int[][] battleBoard = new int[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0) {
                    battleBoard[i][j] = j;
                } else if (j == 0) {
                    battleBoard[i][j] = i;
                } else if (i == ships[6] & j <= (ships[6] + 6 - ships[6])) {
                    battleBoard[i][j] = 1;
                } else if (i == ships[5] & (j > 1 && j <= (ships[5] + 6 - ships[5]))) {
                    battleBoard[i][j] = 1;
                } else if (j == ships[4] & (i > (ships[4] - 5) && i <= (ships[4]))) {
                    battleBoard[i][j] = 1;
                } else if (i == ships[3] & (j > 1 && j <= (ships[3] + 4 - ships[3]))) {
                    battleBoard[i][j] = 1;
                } else if (i == ships[2] & (j > 2 && j <= (ships[2] + 5 - ships[2]))) {
                    battleBoard[i][j] = 1;
                } else if (i == ships[1] & j == 6) {
                    battleBoard[i][j] = 1;
                } else if (j == ships[0] & (i == 2)) {
                    battleBoard[i][j] = 1;
                } else {
                    battleBoard[i][j] = 0;
                }
                //System.out.print(battleBoard[i][j] + " ");
            }
            //System.out.println();
        }
        return battleBoard;
    }

    public static int[] includeCoordinates() throws InterruptedException {
        int[] arr = new int[2];
        Thread.sleep(1000);
        System.out.println("Include coordinates !!");
        arr[0] = new Scanner(System.in).nextInt();
        arr[1] = new Scanner(System.in).nextInt();
        if (arr[0] <= 0 || arr[0] >= 11 || arr[1] <= 0 || arr[1] >= 11) {
            System.out.println("The numbers you entered are incorrect\n" +
                    "Goodbye !!!!!!!!!! ");

        } else {
            System.out.println("We are playing!!!");
        }
        return arr;
    }

    public static String[][] checkCoordinates(int[] arr, int[][] battleBoard, String[][] resultBoard) {
        for (int i = 0; i < battleBoard.length; i++) {
            for (int j = 0; j < battleBoard.length; j++) {
                if (battleBoard[arr[0]][arr[1]] == 1) {
                    resultBoard[arr[0]][arr[1]] = "X";
                } else {
                    resultBoard[arr[0]][arr[1]] = "@";
                }
                System.out.print(resultBoard[i][j] + " ");
            }
            System.out.println();
        }
        return resultBoard;
    }

    public static boolean finishCheck(String[][] resultBoard) {
        int count = 0;
        for (int i = 0; i < resultBoard.length; i++) {
            for (int j = 0; j < resultBoard.length; j++) {
                if (resultBoard[i][j] == "X") {
                    count++;
                }
            }
        }
        return count != 24;
    }
}
