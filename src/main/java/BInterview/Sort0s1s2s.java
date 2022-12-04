package BInterview;

import java.util.Arrays;

public class Sort0s1s2s {

    public static void main(String[] args) {

        int arr[] = {0, 1, 2, 0, 1, 2};
        int zeroCount = 0;
        int oneCount = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                zeroCount++;
            }
            if(arr[i] == 1){
                oneCount++;
            }
        }
        for(int i=0; i<zeroCount; i++) {
            arr[i] = 0;
        }
        for(int i=zeroCount; i<(zeroCount+oneCount); i++) {
            arr[i] = 1;
        }
        for(int i=(zeroCount+oneCount); i<arr.length; i++) {
            arr[i] = 2;
        }

        System.out.println(Arrays.toString(arr));
    }
}
