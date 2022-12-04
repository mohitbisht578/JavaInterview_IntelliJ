package ArrayProgram;

import java.util.HashMap;
import java.util.Map;

public class CountPairsGivenSum {

    public static void main(String[] args) {

        int[] arr = {1, 5, 7, -1, 5};
        int sum = 6;
        getPairsCount(arr, sum);
        getPairsCountUsingMap(arr, sum);
    }

    private static void getPairsCount(int[] arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    //using hashmap
    public static void getPairsCountUsingMap(int arr[], int sum) {

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(sum - arr[i])) {
                count += map.get(sum - arr[i]);
            }

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println(count);
    }
}





