package zcompanyintervuew.stringprorgams;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateCharacter {

    public static void main(String[] args) {

        String word = "Helle";
        char ch[] = word.toCharArray();

        Set<Character> set = new HashSet<>();
        for(int i=0; i<ch.length; i++) {

           char c = ch[i];

           if(set.contains(c))
               System.out.println(c);
           else
               set.add(c);
        }


    }
}
