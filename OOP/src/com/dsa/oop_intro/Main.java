package com.dsa.oop_intro;

public class Main {
    public static void main(String[] args){
        // store 5 roll numbers
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        /*
         * data of 5 students: (roll no, name, marks)
         * we do not want to declare and initialize 3 different
         * variables
         * This where classes come in
         */
        Student[] students = new Student[5];
        int some;
        // declaring
        //Student kunal;
        Student kunal = new Student(); //this is constructor
        Student ed = new Student();
        ed.rno = 8;
        kunal.name ="Matthew Aziz";
        System.out.println(kunal.name);
        System.out.println(ed.rno);
        ed.greeting();
        Student obj;
        for (int i=0; i<100000000; i++){
            obj = new Student(1,2,"aziz");
        }


    }

}
class Student{
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello everyone: " + this.name);
    }

    Student () {
        this.rno = 5;
        this.name = "Matter is all";
        this.marks = 3.334f;
    }
    //Constructor overloading

    Student (int a, int b, String name){
        this.rno = a;
        this.marks = b;
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
