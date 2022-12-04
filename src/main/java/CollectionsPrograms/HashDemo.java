package CollectionsPrograms;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashDemo {

    public static void main(String[] args) {

        //hashmap contain one null key and multiple null value
        Map<String, String> map = new HashMap<>();
        map.put(null, null);
        map.put("one", null);
        map.put("two", null);

      //  System.out.println(map);

        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        //hashtable doesnot contain any null key or value
        Map<String, String> table = new Hashtable<>();
        table.put(null, null);
        System.out.println(table);
        //it will throw null pointer exception at run time

    }
}
