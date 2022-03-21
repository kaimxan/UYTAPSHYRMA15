package com.company;

public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Dancer(String name, String designation) {
        super(name, designation);
    }

    @Override
    public void walk() {
        System.out.println("Hip Hop Dancer ");
    }

    @Override
    public void eat() {
        System.out.println("Dancer eat aple");
    }

    @Override
    public void learn() {
        System.out.println("Hip Hop");
    }
    public void dancing(){
        System.out.println("Dancer dancing");
    }

    @Override
    public String toString() {
        return "Dancer{}"+" "+getDesignation()+" "+getName();
    }
}
