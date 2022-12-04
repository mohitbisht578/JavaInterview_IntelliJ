package BInterview;

public class LargestSumContiguousSub {

    public static void main(String[] args) {

        int arr[] = {-3, -4, 4, -1, -2, 1, 5, -3};

        int current = 0;
        int max = 0;

        for(int i=1; i<arr.length; i++) {

            current = Math.max(arr[i], current + arr[i]);
            max = Math.max(current, max);
        }

        System.out.println(max);
    }
}
