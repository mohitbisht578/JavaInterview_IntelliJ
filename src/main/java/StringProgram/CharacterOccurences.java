package StringProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccurences {

    public static void main(String[] args) {

        String str = "hello";
        char ch[] = str.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character c : ch) {
             if(map.containsKey(c)) {
                 map.put(c, map.get(c) + 1);
             }
             else {
                 map.put(c, 1);
             }
        }

        for(Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
