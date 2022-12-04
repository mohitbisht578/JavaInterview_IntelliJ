package deltaairlines;

import org.w3c.dom.html.HTMLHeadElement;

import java.util.HashMap;
import java.util.Map;

public class CountOccurences {

    public static void main(String[] args) {

        String str = "heellllo";
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

        //highest occurence
        int max = 0;
        char high = ' ';

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(max < entry.getValue()) {
                max = entry.getValue();
                high = entry.getKey();
            }
        }

        System.out.println(high);

//        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
    }
}
