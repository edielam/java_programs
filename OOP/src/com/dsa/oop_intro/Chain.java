package com.dsa.oop_intro;

public class Chain {
    public String empName;
    public float salaryForYear;
    public int dayOfBirth;

    public Chain(){
        this("Edmund Ferry");
    }

    public Chain(String name){
        this(name, 24);
    }
    public Chain(String name, int day){
        this(name,day, 15.3f);
    }
    public Chain(String name, int day, float sal){
        this.empName = name;
        this.dayOfBirth = day;
        this.salaryForYear = sal;
    }
    void display(){
        System.out.println("Employee name: " + empName);
        System.out.println("Employee day of month: "+ dayOfBirth);
        System.out.println("Employee salary: GHS "+ salaryForYear);
    }

    public static void main(String[] args) {
        Chain employer1 = new Chain();
        employer1.display();
    }
}
