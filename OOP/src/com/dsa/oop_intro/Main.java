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


    }
    class Student{
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
    }

}
