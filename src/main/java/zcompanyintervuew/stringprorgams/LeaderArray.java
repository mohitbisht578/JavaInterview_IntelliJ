package zcompanyintervuew.stringprorgams;

public class LeaderArray {

    public static void main(String[] args) {

        int arr[] = {14, 15, 8, 9, 5, 2};
        int max = Integer.MIN_VALUE;

        for(int i=arr.length-1; i>=0; i--) {

            if(arr[i] > max) {
                max = arr[i];
                System.out.println(arr[i] + " ");
            }
        }
    }
}
