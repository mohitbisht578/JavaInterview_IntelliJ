package zcompanyz;

public class MaxSubArraySum {

    //kadane algo TC - 0(n) sc - 0(1)
    public static void main(String[] args) {

        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = 0;
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
