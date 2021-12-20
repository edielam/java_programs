package miu;

import java.util.Arrays;

public class m6 {
    public static void main(String[] args){
        int[] try1 = {1,8,3,2};
        int[] try2 = {4,2,6,1}; 
        System.out.println(Arrays.toString(f(try1, try2)));

    }
     static int[] f(int[] first, int[] second){
         if (first == null || second==null){
             return null;
         }
         int[] result;
         if (first.length > second.length){
             result = new int[first.length];
         } else 
         result = new int[second.length]; 
         int k = 0;
         int [] result2;
         for (int i: first){
             for (int b: second){
                 if (i == b){
                     result[k] = i;
                     k++;
                 }
             }
         }
         result2 = new int[k];
         for (int h=0; h< result.length; h++){
             if (result[h] != 0){
                 result2[h] = result[h];
             }
         }
         return (result2);
     }
}
