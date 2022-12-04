package BInterview;

import java.util.HashSet;
import java.util.Set;

public class CheckPairSumExist {

    public static void main(String[] args) {

        int arr[] = { 1, 4, 45, 6, 10, 8, 6 };
        int sum = 16;

        System.out.println(isPair(arr, sum));

    }

    public static boolean isPair(int arr[], int sum) {

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            if(set.contains(sum - arr[i])) {
                return true;
            }
            else {
                set.add(arr[i]);
            }
        }
        return false;
    }

}
