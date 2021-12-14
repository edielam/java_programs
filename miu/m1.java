package miu; // package is the name of folder/directory

import java.text.NumberFormat;

public class m1 { //name of class, is the name of the java file
    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1225683.8);
        System.out.println(result);
    }
}