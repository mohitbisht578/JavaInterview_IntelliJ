package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListCursor {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("appple");
        list.add("mango");
        list.add("chiku");
        list.add("orange");
        System.out.println(list);

        ListIterator<String> itr = list.listIterator();
        while(itr.hasNext()) {
            String str = itr.next();
            if(str.equals("mango")) {
                itr.remove();
            }
            else if(str.equals("orange")) {
                itr.add("pineapple");
            }
            else if(str.equals("chiku")) {
                itr.set("cherry");
            }
        }
        System.out.println(list);
    }
}
