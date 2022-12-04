package StringProgram;

import java.util.LinkedHashMap;
import java.util.Map;

public class BjyuReverse {

    public static void main(String[] args) {

//        String s = "apPle".toLowerCase();
//        String res = "";
//        for(int i=s.length()-1;i>=0;i--){
//            if(res.indexOf(s.charAt(i))==-1){
//                res+= s.charAt(i);
//            }
//        }
//        System.out.println(res);
//    }
        String name = "apPle";
        name = name.toLowerCase();
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
        String str = "";
        for (char key : map.keySet()) {
            str += key;
        }
        StringBuffer sb = new StringBuffer(str).reverse();
        System.out.print(sb);

    }
}
