package BInterview;

public class EquilibriumPoint {

    public static void main(String[] args) {

        int arr[] = {1, 6, 7, 0, 7};
        int sum = 0;
        int sumSoFar = 0;

        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            sum = sum - arr[i];
            if(sum == sumSoFar) {
                System.out.println(i);
            }
            sumSoFar += arr[i];
        }

    }
}
