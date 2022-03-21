package com.company;

public abstract class Person {
    private String name;
    private  String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
public void walk(){
    System.out.println("person can walk");
}
public void eat(){
    System.out.println("Person can eat");
}
public void learn(){
    System.out.println("person can learn");
}

}
