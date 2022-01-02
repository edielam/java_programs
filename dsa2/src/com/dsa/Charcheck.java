package com.dsa;

import java.util.Scanner;

public class Charcheck {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        //System.out.println("Please enter your string: ");
        //String word = test.next();
        String word2 = "My name is Edward Lampoh. I am an American";
        int count = charcheck(word2,'a');
        System.out.println(count);
    }
    static int charcheck(String word, char ch){
        int count = 0;
        for (int i =0; i < word.length(); i++){
            if (word.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}
