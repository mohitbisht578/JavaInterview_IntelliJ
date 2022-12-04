package Programs;

public class UpperCaseLowerCase {

    public static void main(String[] args) {

        String s = "Welcome To Automation";
        char ch[] = s.toCharArray();
//        String upper = "";
//        String lower = "";
         int upper = 0;
         int lower = 0;

        for(int i=0; i<ch.length; i++) {
            if(ch[i] >= 65 && ch[i] <= 90) {
               // upper += ch[i];
                upper++;
            }
            else {
               // lower += ch[i];
                lower++;
            }
        }
        System.out.println(upper);
        System.out.println(lower);
    }
}
