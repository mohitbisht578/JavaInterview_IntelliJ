package BInterview;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorCursor {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Iterator iterator = numbers.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
