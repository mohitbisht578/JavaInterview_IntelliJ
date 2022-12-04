package importantoptimization;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {

    public static void main(String[] args) {

        //return indices
        int arr[] = {2, 7, 11, 15, 5, 4};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], i);
        }

        for(int i=0; i<arr.length; i++) {
            int numToFind = target - arr[i];
            if(map.containsKey(numToFind) && map.get(numToFind) != i) {
                System.out.println(i + " , " + map.get(numToFind));
            }
        }

    }
}
