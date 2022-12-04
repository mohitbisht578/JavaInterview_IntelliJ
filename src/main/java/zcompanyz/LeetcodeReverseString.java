package zcompanyz;

import java.util.Arrays;

public class LeetcodeReverseString {

    public static void main(String[] args) {

        String s = "mohit";
        char ch[] = s.toCharArray();

        int p1 = 0;
        int p2 = ch.length-1;
        while(p1 <= p2) {
            char temp = ch[p1];
            ch[p1] = ch[p2];
            ch[p2] = temp;
            p1++;
            p2--;
        }
        System.out.println(Arrays.toString(ch));

    }
}
