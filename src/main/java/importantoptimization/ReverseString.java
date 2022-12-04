package importantoptimization;

import java.util.Arrays;
public class ReverseString {
    public static void main(String[] args) {
        String str = "hello mohit";
        char c[] = str.toCharArray();
        int p1 = 0;
        int p2 = str.length()-1;

        while(p1 < p2) {
            char temp = c[p1];
            c[p1] = c[p2];
            c[p2] = temp;
            p1++;
            p2--;
        }

        System.out.println(Arrays.toString(c));
    }
}
