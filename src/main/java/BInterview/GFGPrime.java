package BInterview;

public class GFGPrime {

    // Driver code
    public static void main (String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }

        System.out.println(isPrime(9));
    }

    public static boolean isPrime(int n) {
        if(n==1 || n==0)
            return false;
        for(int i=2; i<n; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
