package com.aca.classroom.week3.human;

public class HumanTest {
    public static void main(String[] args) {
        Human human4 = new Human();


        Human human1 = new Human();
        human1.setName("Jane");
        human1.setHeight(160);

        System.out.println(human1.getStringRepresentation());

        Human human2 = new Human();
        human2.setName("Mark");
        human2.setHeight(-150);

        System.out.println(human2.getStringRepresentation());

        Human human3 = new Human();
        human2.setName("Eric");
        human2.setHeight(-180);

        System.out.println(human3.getStringRepresentation());
    }

}
