package com.dsa;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double ans = 0;
        while (true){
            System.out.println("Please enter your numbers: ");
            double num1 = inp.nextFloat();
            double num2 = inp.nextFloat();
            System.out.println("PLease enter the operand: ");
            char op =  inp.next().trim().charAt(0);
            if(op == 'x' || op == 'X'){
                System.out.println("Exiting Calculator...Done");
                break;
            }
            else if(op == '*' || op == '+' || op == '-' || op =='/' ){
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                    else {
                        System.out.println("Invalid Operation");
                    }
                }
                if(op == '+'){
                    ans = num1 + num2;
                }
            }
            System.out.println(ans);
        }

        }

}
