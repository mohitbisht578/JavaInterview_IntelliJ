package zcompanyz;

import java.util.HashMap;
import java.util.Map;

public class StringOccurence {

    public static void main(String[] args) {

        String str = "hello";
        char ch[] = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : ch) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }

       for(Map.Entry<Character, Integer> entry : map.entrySet()) {
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }

       int max = 0;
       char cha = ' ';

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
               if(max < entry.getValue()) {
                   max = entry.getValue();
                   cha = entry.getKey();
               }
        }
        System.out.println("Highest : " + cha + " : " + max);
    }
}
