package BInterview;

public class StringDigitNumber {

    public static void main(String[] args) {

        String str = "abc12345defg";
        int sum = 0;
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isDigit(c)) {
                sum += c - '0'; //50
            }
        }

        System.out.println(sum);

    }
}
