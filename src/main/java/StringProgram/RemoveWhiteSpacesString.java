package StringProgram;

public class RemoveWhiteSpacesString {

    public static void main(String[] args) {

        String str  = "Java      programming   selenium     automation     ";
        String str1 = "";
      //  str = str.replaceAll("\\s", "");
        // System.out.println(str);

        for(int i=0; i<str.length(); i++) {
           if(str.charAt(i) != ' ') {
               str1 = str1 + str.charAt(i);
           }
        }
        System.out.println(str1);
    }
}
