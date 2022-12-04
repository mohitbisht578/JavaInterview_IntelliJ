package ArrayProgram;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int arr[] = {1, 4, 2, 5};
        //array reverse
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++) {
//                if(arr[i] < arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
        System.out.println(Arrays.toString(arr));

    }
}
