package miu;

public class m5 {
    public static void main (String[] args){
        int b = 12345;
        System.out.println(f(b));

    }
    static int f(int n){
        int rev = 0;
        if (n > 0) {
            while (n > 0 ){
                rev = (rev * 10) + (n % 10);
                n /= 10;
            }
        } else {
            while (n < 0 ){
                rev = (rev * 10) + (n % 10);
                n /= 10;
        }
    }
    return(rev);
    }
}