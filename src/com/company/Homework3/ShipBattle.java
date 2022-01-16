package com.company.Homework3;

public class ShipBattle {
    public static void main(String[] args) {
        String[][] array = new String[11][11];

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0) {
                    array[i][j] = "" + j;
                } else if (j == 0) {
                    array[i][j] = "" + i;
                } else {
                    array[i][j] = "*";
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[] createShipsPoints() {
        int ship6 = (int) (Math.random() * 10);
        int ship5_1 = (int) (Math.random() * 10);
        int ship5_2 = (int) (Math.random() * 10);
        int ship3_1 = (int) (Math.random() * 10);
        int ship3_2 = (int) (Math.random() * 10);
        int ship1_1 = (int) (Math.random() * 10);
        int ship1_2 = (int) (Math.random() * 10);
        int[] ships = new int[7];

        while ((ship6 == ship5_2)&&ship6>=4) {
            ship6 = (int) (Math.random() * 10);
        }
        while ((ship5_2 == ship6 || ship5_2 == ship5_1) && ship5_2 >= 5) {
            ship = (int) (Math.random() * 10);
        }
        while ((ship3_2 == ship3_1 || ship3_2 == ship1_2 || ship3_2 == ship1_1)&&ship3_1>=7) {
            ship3_2 = (int) (Math.random() * 10);
        }
        while ((ship5_1 == ship3_2 || ship5_1 == ship3_1 || ship5_1 == ship1_2 || ship5_1 == ship1_1)&& {
            ship5_1 = (int) (Math.random() * 10);
        }
        while (ship5_2 == ship5_1 || ship5_2 == ship3_2 || ship5_2 == ship3_1 || ship5_2 == ship1_2 || ship5_2 == ship1_1) {
            ship5_2 = (int) (Math.random() * 10);
        }
        while (ship6 == ship5_2 || ship6 == ship5_1 || ship6 == ship3_2 || ship6 == ship3_1 || ship6 == ship1_2 || ship6 == ship1_1)
            ships[0] = ship1_1;
        ships[1] = ship1_2;
        ships[2] = ship3_1;
        ships[3] = ship3_2;
        ships[4] = ship5_1;
        ships[5] = ship5_2;
        ships[6] = ship6;
        return ships;
    }

    public static void createShipsInBoard(int[] ships) {
        int[][] battleBoard = new int[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0) {
                    battleBoard[i][j] = j;
                } else if (j == 0) {
                    battleBoard[i][j] = i;
                } else if (ships[6] >= 5 && i <=) {
                    battleBoard[i][j] =;
                }
                System.out.print(battleBoard[i][j] + " ");


            }

        }


    }
}
