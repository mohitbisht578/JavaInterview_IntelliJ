package BInterview;

public class StringReverseWord {

    public static void main(String[] args) {

        String str = "my      java    is   programming";
        str = str.replaceAll("\\s+", " ");
        String split[] = str.split(" ");
        String rev = "";
        for(String s : split) {
            String revWord = "";
            for(int i=s.length()-1; i>=0; i--) {
                revWord += s.charAt(i);
            }
            rev += revWord + " ";
        }

        System.out.println(rev);
    }

}
