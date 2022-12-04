package importantoptimization;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int arr1[] = {1, 5, 6, 7};
        int arr2[] = {2, 8, 9, 11};
        int len1 = arr1.length;
        int len2 = arr2.length;
        int result[] = new int[len1 + len2];
        int i= 0, j=0, k=0;
        while(i < len1 && j < len2) {
            if(arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            }
            else {
                result[k++] = arr2[j++];
            }
        }
        while(i < len1) {
            result[k++] = arr1[i++];
        }
        while(j < len2) {
            result[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(result));
    }
}
