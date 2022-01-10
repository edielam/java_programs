package com.dsa.oop_intro;

public class Child extends Inherit{
    int z;
    public void subtraction(){
        z = addition() - i;
        System.out.println(z);
    }

    public static void main(String[] args) {
        Child ans = new Child();
        System.out.println(ans.addition());
        ans.subtraction();
    }
}
