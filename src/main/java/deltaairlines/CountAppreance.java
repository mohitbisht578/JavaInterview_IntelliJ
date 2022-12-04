package deltaairlines;

public class CountAppreance {

    public static void main(String[] args) {

        String str = "hello";
        char c = 'h';
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == c) {
                count++;
            }
        }

        System.out.println(count);
    }
}
