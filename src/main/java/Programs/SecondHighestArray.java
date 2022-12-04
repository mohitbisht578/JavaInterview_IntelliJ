package Programs;

public class SecondHighestArray {
    public static void main(String[] args) {

        int arr[] = {1, 2};
        int len = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if(arr.length<=1) {
            return;
        }

        for(int i=0; i<len; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
