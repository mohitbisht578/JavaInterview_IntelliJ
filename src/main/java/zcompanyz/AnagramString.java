package zcompanyz;

import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args) {

        System.out.println(isAnagram("Listen", "Silent"));
    }

    private static boolean isAnagram(String s1, String s2) {

        char ch1[] = s1.toLowerCase().toCharArray();
        char ch2[] = s2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
}
