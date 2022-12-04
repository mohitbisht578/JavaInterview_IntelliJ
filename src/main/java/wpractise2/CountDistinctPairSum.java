package wpractise2;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctPairSum {

    public static void main(String[] args) {
        int arr[] = {5, 6, 5, 7, 7, 8};
        int sum = 13;
        System.out.print(countDistinctPairs(arr, sum));
    }

    private static int countDistinctPairs(int[] arr, int sum) {

        // Store frequency of each distinct
        // element of the array
        // Store frequency of each distinct
        // element of the array
        int countPairs = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int i = entry.getKey();
            if(2*i == sum) {
                if(map.get(i) > 1) {
                    countPairs += 2;
                }
            }
            else {
                if(map.containsKey(sum-i)) {
                    countPairs += 1;
                }
            }
        }
        countPairs = countPairs / 2;
        return countPairs;
    }
    }
