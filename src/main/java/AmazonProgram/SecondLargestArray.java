package AmazonProgram;

public class SecondLargestArray {

    public static void main(String[] args) {

        int arr[] = {1, 2};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if(arr.length <= 1) {
            return;
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("second largest element is : " + secondLargest);
    }
}
