package mondayinterview;

import java.util.Arrays;

public class ShiftZeroAtEnd {

    public static void main(String[] args) {

        int arr[] = {1, 0, 2, 0};
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        for(int i=count; i<arr.length; i++) {
            arr[count] = 0;
            count++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
