package importantoptimization;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String s = "geeksforgeeks";
        String sb = "";
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (sb.indexOf(c) < 0) {
                sb += c;
            }
        }
            System.out.println(sb);
        }
    }
