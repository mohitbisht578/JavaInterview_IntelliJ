package AmazonProgram;

import java.util.HashSet;
import java.util.Set;

public class LongestRepeatingSubstring {

    public static void main(String[] args) {

        //TC-0(1) //sliding window approach
        String str = "abcbcdefg";
        int maxCount = 0;
        int i = 0;
        int j = 0;
        int len = str.length();
        Set<Character> set = new HashSet<>();
        while(i < len && j < len) {
            if(!set.contains(str.charAt(j))) {
                set.add(str.charAt(j));
                j++;
                maxCount = Math.max(maxCount, j-i);
            } else{
                set.remove(str.charAt(i));    //remove the char from set and incremene i as it is already present in set
                i++;
            }
        }

        System.out.println(maxCount);

    }
}
