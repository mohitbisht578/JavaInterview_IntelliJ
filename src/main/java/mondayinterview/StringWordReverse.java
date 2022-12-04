package mondayinterview;

public class StringWordReverse {

    public static void main(String[] args) {

        String str = "hello world";
        String split[] = str.split(" ");
        String revWord = "";
        for(String s : split) {
            String rev = "";
            for(int i=s.length()-1; i>=0; i--) {
                rev = rev + s.charAt(i);
            }
            revWord = revWord + rev + " ";
        }

        System.out.println(revWord);
    }

}
