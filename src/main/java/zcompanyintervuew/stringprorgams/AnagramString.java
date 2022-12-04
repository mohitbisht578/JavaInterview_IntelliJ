package zcompanyintervuew.stringprorgams;

import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args) {

        String str1 = "Grab";
        String str2 = "Brag";

       // System.out.println(isAnagram(str1, str2));

        int arr[] = {1, 4, 5, 2, 8};
        Arrays.toString(arr);
        System.out.println(arr);
    }

    public static boolean isAnagram(String str1, String str2) {

        char ch1[] = str1.toLowerCase().toCharArray();
        char ch2[] = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }

    public static int[] sort(int arr1[]) {

        for(int i=0; i<arr1.length; i++) {
            for(int j=i+1; j< arr1.length; j++) {
                if(arr1[i] > arr1[j]) {
                    int k = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = k;
                }
            }
        }
        return arr1;
    }
}
