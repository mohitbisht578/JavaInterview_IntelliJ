package deltaairlines;

public class CountWords {

    public static void main(String[] args) {

        String str = "hello w";

        int count = 1;

        for(int i=0; i<str.length()-1; i++) {

            if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {

                count++;
            }
        }

        System.out.println("total word in a string is : " + count);
    }
}
