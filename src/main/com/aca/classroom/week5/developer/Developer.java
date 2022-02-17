package com.aca.classroom.week5.developer;

public class Developer {

    private String name;



    public Developer(String name){
        this.name = name;
    }


    public static void main(String[] args) {

        Developer developer1 = new Developer("Kate");
        Developer developer = new Developer("Kate");
        System.out.println(developer== developer1);
        System.out.println(developer.equals(developer1));

        System.out.println();
        developer1.toString();

    }

    @Override
    public boolean equals(Object o) {
        Developer o1 = (Developer)o;
        return  this.name == o1.name;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }

    public String getName(){
        return name;
    }

    public  long getSalary(){
        return 60_000;

    }

    public long Budget(){
        return 300;

    }

    @Override
    public String toString() {
        return "name "+ name +" salary "+ getSalary();
    }
}
