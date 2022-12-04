package wpractise2;

import java.util.Arrays;

public class StringReverse {

    public static void main(String[] args) {

        String str = "mohit";
        char ch[] = str.toCharArray();
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
