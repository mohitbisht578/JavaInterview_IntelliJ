package importantoptimization;

public class LeaderArray {

    public static void main(String[] args) {

        int arr[] = {1 , 0, 5, 7 , 2, 1};
        int len = arr.length;
        int max = len-1;
        System.out.println(arr[max] + " ");

        for(int i=len-1; i>=0; i--) {
            if(arr[i] > max) {
                max = arr[i];
                System.out.println(arr[i] + " ");
            }
        }
    }
}
