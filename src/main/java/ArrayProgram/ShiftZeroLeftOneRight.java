package ArrayProgram;

import java.util.Arrays;

public class ShiftZeroLeftOneRight {

    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 1, 0, 1, 0, 1};

        int len = arr.length;
        int left = 0;
        int right = len-1;

        while(left < right) {

            while(arr[left] == 0 && left < right) {
                left++;
            }

            while(arr[right] == 1 && left < right) {
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
