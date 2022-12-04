package wpractise2;

public class PalindromeString {

    public static void main(String[] args) {

        String s = "A man, a plan, a ......canal: Panama";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if(Character.isDigit(s.charAt(i)) && Character.isLetter(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        int len = sb.length()-1;
        for(int i=0; i<len/2; i++){
            if(s.charAt(i) != sb.charAt(len-i)) {
                return false;
            }
        }
        return true;
    }
}
