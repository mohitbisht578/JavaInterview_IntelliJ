package wpractise2;

public class MaxArrraySunm {

    public static void main(String[] args) {

        int arr[] = {-2,1,-3,4,1};
        int sum = 5;
        int max = arr[0];

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max);


    }
}
