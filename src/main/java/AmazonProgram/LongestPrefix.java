package AmazonProgram;

import java.util.Arrays;

public class LongestPrefix {

    public static void main(String[] args) {

        String words[] = {""};
        String prefix = words[0];

        for(String word : words) {
            while(word.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        if(!prefix.equals("")) {
            System.out.println(prefix);
        }
        else {
            System.out.println("there is no longest common prefix");
        }

    }
}
