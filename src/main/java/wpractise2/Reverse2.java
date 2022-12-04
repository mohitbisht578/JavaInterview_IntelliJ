package wpractise2;

public class Reverse2 {

    public static void main(String[] args) {

        String str = "hello world";
        String split[] = str.split(" ");
        String reverse = "";

        for(String s : split) {
            String revWord = "";
            for(int i=s.length()-1; i>=0; i--) {
                revWord += s.charAt(i);
            }
            reverse += revWord + " ";
        }

        System.out.println(reverse);
    }
}
