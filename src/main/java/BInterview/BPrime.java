package BInterview;

public class BPrime {

    public static void main(String[] args) {

        for(int i=1; i<=10; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean isPrime(int num) {
        if(num==1 || num==0)
            return false;
        for(int i=2; i<num; i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}
