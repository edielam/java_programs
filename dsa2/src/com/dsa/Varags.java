package com.dsa;

import java.util.Arrays;

public class Varags {
    public static void main(String[] args) {
        mult(5, "jj", "gg");
    }
    static int mult(int a, String ...b){
        System.out.println(Arrays.toString(b));
        return 0;
    }
}
