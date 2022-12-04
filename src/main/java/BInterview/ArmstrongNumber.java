package BInterview;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int num = 153;
        System.out.println(isArmstrong(num));
    }

    public static boolean isArmstrong(int num) {
        int temp = num;
        int rem=0;
        int rev=0;
        while(num != 0) {
            rem = num%10;
            rev = rev+rem*rem*rem;
            num = num/10;
        }
        if(temp==rev) {
            return true;
        }
        return false;
    }
}
