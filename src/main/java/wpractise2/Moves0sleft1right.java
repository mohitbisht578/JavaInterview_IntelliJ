package wpractise2;

import java.util.Arrays;

public class Moves0sleft1right {

    public static void main(String[] args) {

        int arr[] = {1, 0, 1, 0, 1, 0, 1, 0};
        int p1 = 0;
        int p2 = arr.length-1;

        while(p1 < p2) {
            while(p1 < p2 && arr[p1] == 0) {
                p1++;
            }
            while(p1 < p2 && arr[p2] == 1) {
                p2--;
            }
            if(p1 < p2) {
                arr[p1] = 0;
                arr[p2] = 1;
                p1++;
                p2--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
