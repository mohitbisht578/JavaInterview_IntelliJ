package zcompanyintervuew.stringprorgams;

import java.util.HashMap;

public class RepeatingString {

    public static void main(String[] args) {

        String str = "haelleoh";
        firstRepeatedNonRepeatedChar(str);

    }
    static void firstRepeatedNonRepeatedChar(String inputString) {

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (char c : strArray) {
            if (charCountMap.get(c) == 1) {
                System.out.println("First Non-Repeated Character In '" + inputString + "' is '" + c + "'");
                break;
            }
        }

        for (char c : strArray) {
            if (charCountMap.get(c) > 1) {
                System.out.println("First Repeated Character In '" + inputString + "' is '" + c + "'");
                break;
            }
        }
    }
}
