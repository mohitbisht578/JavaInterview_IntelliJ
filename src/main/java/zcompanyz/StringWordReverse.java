package zcompanyz;

public class StringWordReverse {

    public static void main(String[] args) {

        String str = "Hello World";
        String split[] = str.split(" ");
        String revStr = "";

        for(String s : split) {
            String rev = "";
            for(int i=s.length()-1; i>=0; i--) {
                rev = rev + s.charAt(i);
            }
            revStr = revStr + rev + " ";
        }

        System.out.println(revStr);
    }
}
