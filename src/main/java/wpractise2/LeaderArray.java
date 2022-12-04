package wpractise2;

public class LeaderArray {

    public static void main(String[] args) {

        int arr[] = {14, 15, 8, 9, 5, 2};
        int len = arr.length;
        int max = len-1;
        System.out.println(max + " ");

        for(int i=len-2; i>=0; i--) {
            if(arr[i] > max) {
                max = arr[i];
                System.out.println(arr[i] + " ");
            }
        }

    }
}
