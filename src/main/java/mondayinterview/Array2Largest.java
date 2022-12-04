package mondayinterview;

public class Array2Largest {

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 0, 6, 10, 8, 10};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("largest element in an array is : " + largest);
        System.out.println("Second largest element in an array is : " + secondLargest);
    }
}
