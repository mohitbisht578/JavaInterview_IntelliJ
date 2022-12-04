package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(0);
        System.out.println(list.get(2));

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
