package zcompanyintervuew.stringprorgams;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterString {

    public static void main(String[] args) {

        String s = "hello";

        char ch[] = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : ch) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        map.entrySet().stream().filter(e -> e.getValue() > 1).forEach(System.out::println);
    }
}
