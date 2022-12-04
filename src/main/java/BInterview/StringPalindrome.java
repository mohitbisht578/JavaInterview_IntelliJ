package BInterview;

public class StringPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));
    }

    public static boolean isPalindrome(String str) {
        int len = str.length();
        for(int i=0; i<len/2; i++) {
            if(str.charAt(i) == str.charAt(len-1-i)) {
                return true;
            }
        }

        return false;
    }
}
