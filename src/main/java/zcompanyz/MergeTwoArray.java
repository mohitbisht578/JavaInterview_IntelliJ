package zcompanyz;

import java.util.Arrays;

public class MergeTwoArray {

    public static void main(String[] args) {

        int arr1[] = {10, 20, 30};
        int arr2[] = {40, 50, 60, 70};

        int arr3[] = new int[arr1.length + arr2.length];

        for(int i=0; i< arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for(int i=0; i<arr2.length; i++) {
            arr3[arr1.length+i] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));



    }
}
