package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);

        list.remove(4);
        for(int i=list.size()-1; i>=0; i--) {
            System.out.println(list.get(i));
        }
    }
}
