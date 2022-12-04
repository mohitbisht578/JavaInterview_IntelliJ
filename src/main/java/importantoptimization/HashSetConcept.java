package importantoptimization;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 2, 1, 5};
        Set<Integer> set = new HashSet<>();
        for(int e : arr) {
            set.add(e);
        }
       for(int s : set) {
           System.out.println(s);
       }
    }
}
