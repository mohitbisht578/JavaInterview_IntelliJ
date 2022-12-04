package zcompanyintervuew.stringprorgams;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "abcdeabcbb";
        char[] ch = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for(char c : ch) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }

        char c = map.
                entrySet().
                stream().
                filter(e -> e.getValue()==1).
                findFirst().
                get().
                getKey();

        System.out.println(c);
    }
}
