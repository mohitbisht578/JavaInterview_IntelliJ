package BInterview;

import java.util.Arrays;

public class Sort0s1s {

    //TC - 0(n); if there are n element i am traversing n element
    //SC - 0(1); not using any such space it is just constant variable
    public static void main(String[] args) {

        int arr[] = {1, 0, 1, 0, 1, 0, 1, 0};
        int len = arr.length;
        int left = 0;
        int right = len-1;

        while(left < right) {
            if(arr[left] == 0 && left < right) {
                left++;
            }
            if(arr[right] == 1 && left < right) {
                right--;
            }
            if(left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
