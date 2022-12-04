package BInterview;

import java.util.ArrayList;

public class ListReverse {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.add("pink");

        for(int i=list.size()-1; i>=0; i--) {
            System.out.println(list.get(i));
        }
    }
}
