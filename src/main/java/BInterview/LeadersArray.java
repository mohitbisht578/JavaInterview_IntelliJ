package BInterview;

public class LeadersArray {

    public static void main(String[] args) {

        int arr[] = {14, 15, 8, 9, 5, 2};
        int len = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i=len-1; i>=0; i--) {
            if(arr[i] > max) {
                max = arr[i];
                System.out.println(arr[i]);
            }
        }
    }
}
