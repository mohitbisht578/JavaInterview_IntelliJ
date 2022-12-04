package BInterview;

public class PrimeNumber {

    public static void main(String[] args) {

        int i = 1;
        int num = 15;
        int count = 0;

        while(i<num) {
            if(num%i==0) {
                count=count+1;
            }
            i++;
        }
        if(count==1) {
            System.out.println("prime");
        }
        else {
            System.out.println("nprime");
        }
    }
}
