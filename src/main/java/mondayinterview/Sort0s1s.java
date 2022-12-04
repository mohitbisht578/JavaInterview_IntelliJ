package mondayinterview;

import java.util.Arrays;

public class Sort0s1s {

    public static void main(String[] args) {


        int arr[] = {1 , 0, 1, 0};
        int zeroCount = 0;
        int oneCount = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                zeroCount++;
            }
            if(arr[i] == 1) {
                oneCount++;
            }
        }

        for(int i=0; i<zeroCount; i++) {
            arr[i] = 0;
        }

        for(int i=zeroCount; i<zeroCount+oneCount; i++) {
            arr[i] = 1;
        }


        System.out.println(Arrays.toString(arr));

    }
}
