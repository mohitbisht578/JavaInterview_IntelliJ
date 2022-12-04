package zcompanyz;

public class PrimeNum {

    public static void main(String[] args) {

        int num = 1;
        System.out.println(isPrime(num));

    }


    public static boolean isPrime(int num) {

        if(num <= 1)
            return false;

        if(num == 2)
            return true;

        if(num %2 == 0)
            return false;

        //check for odds
        for(int i=3; i<=Math.sqrt(num); i+=2) {
            if(num %i == 0)
                return false;
        }
        return true;


    }
}
