package miu;

public class exam {
    public static void main(String[] args){
        int b = 8;
        System.out.println(isPrimeHappy(b));
    }

    static int isPrimeHappy(int n){
        int sumPrime = 0;
        boolean isPrime = false;

        for (int i = 2; i < n; i++) {
            isPrime = true;
        for (int j = 2; j <= i/2; j++) {
            if (i % j == 0) {
            isPrime = false;
            break;
            }
        }
        if (isPrime) {
            sumPrime += i;
        }
        
        }
        if (sumPrime > 0 && sumPrime % n == 0)
            return 1;
        else
            return 0;
  }
}
