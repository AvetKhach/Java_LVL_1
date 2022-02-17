package com.aca.classroom.week3.player;

public class Game {
    String name;
    long shootCount;

     static long fireCallCount;

    public static void main(String[] args) {

        Game first= new Game();
        Game second = new Game();
        first.name= "game1";
        second.name= "game2";

        for (int i = 0; i < 5; i++) {
            first.fire();
            System.out.println(first.name);
        }
        for (int i = 0; i < 125; i++) {
            System.out.println(second.name);
            second.fire();
        }
        System.out.println(fireCallCount);
      }
      public void fire(){
        shootCount ++;
        System.out.print(" fire");
        fireCallCount++;
      }

    public void printGame() {

        System.out.println("name : " + name + ", shootCount : " +shootCount);
    }





}
