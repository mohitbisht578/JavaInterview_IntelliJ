package zcompanyz;

import java.util.Arrays;

public class ArrayMax {

    public static void main(String[] args) {

        int arr[] = {1, 4, 2, 6, 8, -1 , 0};
        int len = arr.length;

        for(int i=0; i<len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            System.out.println(Arrays.toString(arr));
            System.out.println("Largest element in array is : " + arr[len-1]);
            System.out.println("Second Largest element in array is : " + arr[len-2]);
            System.out.println("Smallest element in array is : " + arr[0]);
            System.out.println("Second Smallest element in array is : " + arr[1]);
        }
    }
