package zcompanyintervuew.stringprorgams;

import java.util.HashMap;

public class FirstRepeatingArray {

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 1, 2};
        firstRepeatedNonRepeatedChar(arr);
    }

    static void firstRepeatedNonRepeatedChar(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int e : arr) {
            if(map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            }
            else {
                map.put(e, 1);
            }
        }

        for(int e : arr) {
            if(map.get(e) == 1) {
                System.out.println("First non repeating element is : " + e);
                break;
            }
        }

        for(int e : arr) {
            if(map.get(e) > 1) {
                System.out.println("First repeating element is : " + e);
                break;
            }
        }
    }
}
