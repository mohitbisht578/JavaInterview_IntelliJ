package zcompanyz;

import java.util.Arrays;

public class ShiftZeroAtFront {

    public static void main(String[] args) {

        int arr[] = {1, 0, 2, 0, 3, 0, 0, 0};

        int len = arr.length-1;
        int count = len;

        for(int i=len; i>=0; i--) {
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count--;
            }
        }

        for(int i=count; i>=0; i--) {
            arr[count] = 0;
            count--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
