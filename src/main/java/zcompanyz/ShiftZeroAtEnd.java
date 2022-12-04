package zcompanyz;

import java.util.Arrays;

public class ShiftZeroAtEnd {

    public static void main(String[] args) {

        int arr[] = {1, 0, 2, 0, 3, 0, 0, 0};
        int len = arr.length;
        int count = 0;

        for(int i=0; i<len; i++) {
            if(arr[i] != 0) {
                arr[count]= arr[i];
                count++;
            }
        }
        for(int i=count; i<len; i++) {
            arr[count] = 0;
            count++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
