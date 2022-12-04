package AmazonProgram;

import java.util.Arrays;

public class Sort0s1s {

    public static void main(String[] args) {

        int arr[] = {0 , 1, 0, 1, 0, 1, 0, 1};
        int left = 0;
        int right = arr.length-1;

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
