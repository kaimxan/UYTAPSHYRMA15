package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation) {
        super(name, designation);
    }

    @Override
    public void walk() {
        System.out.println("Classic Singer");
    }

    @Override
    public void eat() {
        System.out.println("Singer eat icecream");
    }

    @Override
    public void learn() {
        System.out.println("Singer ....");
    }
    public void singing(){
    System.out.println("singer song");
}
    public void playGitar(){
    System.out.println("Singer play gitary");
}

    @Override
    public String toString() {
        return "Singer{}"+" "+getDesignation()+" "+getName();
    }
}

