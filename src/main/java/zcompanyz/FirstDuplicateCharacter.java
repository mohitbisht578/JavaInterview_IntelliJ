package zcompanyz;

import java.util.HashMap;
import java.util.Map;

public class FirstDuplicateCharacter {

    public static void main(String[] args) {

        String str = "heelloh";
        char ch[] = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
//non repeating
//        char cha =  map.entrySet().stream().filter(e -> e.getValue()==1).findFirst().get().getKey();
//        System.out.println(cha);

        for(char c : ch) {
            if(map.get(c) == 1) {
                System.out.println("First non repeating element is : " + c);
                break;
            }
        }

        for(char c : ch) {
            if(map.get(c) > 1) {
                System.out.println("First repeating element is : " + c);
                break;
            }
        }

    }
}
