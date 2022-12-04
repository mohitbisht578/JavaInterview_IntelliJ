package AmazonProgram;

public class PalindromeString {

    public static void main(String[] args) {

        String str = "abbaa";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
