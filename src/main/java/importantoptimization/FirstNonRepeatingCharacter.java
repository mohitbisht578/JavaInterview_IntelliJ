package importantoptimization;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String s = "abacabad";
        char ch[] = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : ch) {
            if(map.containsKey(c)) {
                map.put(c , map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        for(char c : ch) {
            if(map.get(c)==1) {
                System.out.println("First non repeating character is : " + c);
                break;
            }
        }

        for(char c : ch) {
            if(map.get(c)>1) {
                System.out.println("First repeating character is : " + c);
                break;
            }
        }
    }
}
