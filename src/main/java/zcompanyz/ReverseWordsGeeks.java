package zcompanyz;

public class ReverseWordsGeeks {

    public static void main(String[] args) {

        String s = "i like this program       very much     ";
        s = s.replaceAll("\\s+", " ");
        String str[] = s.split(" ");
        String rev = "";
        for(int i=str.length-1; i>=0; i--) {
            rev += str[i] + " ";
        }
        System.out.println(rev);

    }
}
