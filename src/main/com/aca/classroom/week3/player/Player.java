package com.aca.classroom.week3.player;

public class Player {
    String userName;
    Game[] gamesArray;

    public static void main(String[] args) {
        Player player = new Player();
        player.userName = "aca";


        Game[] gamesArray = new Game[2];
        gamesArray[0]=new Game();
        gamesArray[1]=new Game();

        Game game = gamesArray[0];
        game.name = "";
        gamesArray[1].name = "";



        player.gamesArray = gamesArray;
        gamesArray[0].name = "game1";
        gamesArray[1].name = "game2";
        player.print();


    }

    public void print() {
        System.out.println("userName : " + userName);
        for (int i = 0; i < gamesArray.length; i++) {
            System.out.println("game " + i);

            gamesArray[i].printGame();
            //System.out.println("name : " + gamesArray[i].name + ", shootCount : " + gamesArray[i].shootCount);
        }

    }

}
