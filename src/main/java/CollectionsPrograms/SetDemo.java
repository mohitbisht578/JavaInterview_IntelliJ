package CollectionsPrograms;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {


        Set<Integer> list = new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

      //  ArrayList l = new ArrayList(list);

        for(int e : list) {
            System.out.println(e);
        }

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
            Integer text = itr.next();
            System.out.println(text);
        }
    }
}
