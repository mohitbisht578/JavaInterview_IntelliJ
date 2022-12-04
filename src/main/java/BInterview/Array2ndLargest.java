package BInterview;

public class Array2ndLargest {
    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 0, 5, 5, 4};
        int len = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<len; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest : " + largest);
        System.out.println("Second largest : " + secondLargest);
    }
}
