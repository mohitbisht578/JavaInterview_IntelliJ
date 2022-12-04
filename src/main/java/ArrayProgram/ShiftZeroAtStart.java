package ArrayProgram;

import java.util.Arrays;

public class ShiftZeroAtStart {

    public static void main(String[] args) {

        int arr[] = {1, 0, 2, 4, 0, 8};

        int len = arr.length;
        int count = len-1;

        for(int i=len-1; i>=0; i--) {
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
