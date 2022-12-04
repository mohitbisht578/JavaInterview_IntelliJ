package ServiceNow;

import java.util.ArrayList;
import java.util.Arrays;

public class ListConcetp {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 4, 5));

        list2.removeAll(list1);
        System.out.println(list1);
    }
}
