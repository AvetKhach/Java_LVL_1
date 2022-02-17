package com.aca.classroom.week5.developer;

public class JuniorDeveloper extends Developer{

    private long salary;

    public JuniorDeveloper(){
        super("himar ban");
    }
    public JuniorDeveloper(String name, long salary){
        super(name);
        this.salary = salary;
    }
    public long getSalary(){
        return salary;
    }



    public static void main(String[] args) {
        JuniorDeveloper juniorDeveloper= new JuniorDeveloper();
        JuniorDeveloper kate = new JuniorDeveloper("kate", 30_00);
        kate.toString();
    }


}
