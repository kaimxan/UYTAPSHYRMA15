package com.company;

public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String designation) {
        super(name, designation);
    }

    @Override
    public void walk() {
        System.out.println("Programmer walk every day");
    }

    @Override
    public void eat() {
        System.out.println("Programmer eating");
    }

    @Override
    public void learn() {
        System.out.println("Programmer learn code");
    }
    public void codding(){
        System.out.println("Programmer codding now");
    }

    @Override
    public String toString() {
        return "Programmer{}"+" "+getDesignation()+" "+getName();
    }
}
