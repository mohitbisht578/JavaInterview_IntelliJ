package StringProgram;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstDuplicateCharacter {

        public static void main(String args[]) {
            String word = "Hare Krishna";
            char[] characters = word.toCharArray();

            // build HashMap with character and number of times they appear in String
            LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
            for (Character ch : characters) {
                if (charMap.containsKey(ch)) {
                    charMap.put(ch, charMap.get(ch) + 1);
                } else {
                    charMap.put(ch, 1);
                }
            }

            System.out.println(charMap);
            for(Map.Entry<Character, Integer> p : charMap.entrySet()){
                if(p.getValue() > 1){
                    System.out.println(p.getKey());
                }
            }
        }
    }

