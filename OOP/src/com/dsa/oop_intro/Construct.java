package com.dsa.oop_intro;

public class Construct {
    String name;
    int age;

    public Construct(){
        //System.out.println("Hello World");
    }
    public Construct(int num, String word){
        this.name = word;
        this.age = num;
    }
    public static void main(String[] args){
        Construct ben = new Construct();
        ben.name = "Ed";
        Construct benali = new Construct(23, "Benali");
        System.out.println("My name is " + ben.name);

    }
}
