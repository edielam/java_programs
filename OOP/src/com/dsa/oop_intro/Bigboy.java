package com.dsa.oop_intro;

public class Bigboy {
    int num = 230;
    Bigboy(){
        System.out.println("no arg");
    }
    Bigboy(String name){
        System.out.println("parameterized "+name);
    }
}

class Smallboy extends Bigboy{
    int age = num;
    Smallboy(){
        super("flag");
    }

    public static void main(String[] args) {
        Smallboy ed = new Smallboy();
        Bigboy edd = new Bigboy();
        //System.out.println(edd.num);
        //System.out.println(ed.num);
        System.out.println(ed.age);
    }
}
