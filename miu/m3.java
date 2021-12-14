package miu;

public class m3 {
    public static void main(String[] args){
        int[] b = {1, 2, 3, 4};
        System.out.println(fun(b));
    }    

    static int fun(int[] a){
        int sumEeven = 0;
        int sumOdd = 0;
        for (int i=0; i< a.length; i++){
            if (a[i]%2 == 0){
                sumEeven += a[i];
            } else {
                sumOdd += a[i];
            }
        }
        return (sumEeven - sumOdd);
    }
}