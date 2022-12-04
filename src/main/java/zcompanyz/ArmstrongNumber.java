package zcompanyz;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int num = 153;
        int temp = num;
        int rev = 0;
        int rem = 0;

        while(num != 0) {
            rem = num%10;
            rev = rev+rem*rem*rem;
            num = num/10;
        }
        if(rev == temp) {
            System.out.println(rev + " is a armstrong no");
        }
        else {
            System.out.println(rev + " is not a armstrong no");
        }
    }
}
