package zcompanyintervuew.stringprorgams;

import java.util.HashSet;

public class StringUniqueCharacter {

    public static void main(String[] args) {

        String input = "Gksll";
        System.out.println(uniqueCharacter(input));
        System.out.println(isUniqueCharacter(input));
    }

    public static boolean uniqueCharacter(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j))
                    return false;
            }
        }
        return true;
    }

    public static boolean isUniqueCharacter(String input) {
        HashSet<Character> char_set = new HashSet<>();
        for(int i=0; i<input.length(); i++) {
            char_set.add(input.charAt(i));
        }
        if(char_set.size() == input.length())
            return true;
        else
            return false;
    }
}

