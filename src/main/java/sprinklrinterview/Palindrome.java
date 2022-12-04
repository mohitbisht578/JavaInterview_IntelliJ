package sprinklrinterview;

public class Palindrome {

    public static void main(String[] args) {

       // String Palindrome with 2 test cases. TC1 - Empty String, TC2 - Single character

        System.out.println(isPalindrome("aff "));
    }

    public static boolean isPalindrome(String str) {
        int len = str.length();

        if(str == null) {
            return false;
        }

        for(int i=0; i<len/2; i++) {
            if(str.charAt(i) != str.charAt(len-1-i)) {
                  return false;
            }
        }

        return true;
    }
}
