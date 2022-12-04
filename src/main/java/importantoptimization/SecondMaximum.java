package importantoptimization;

public class SecondMaximum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5};
        int len = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for(int i=0; i<len; i++) {
            if(arr[i] > largest && arr[i] > secondLargest) {
                thirdLargest = largest;
                secondLargest = largest;
                largest = arr[i];
            }
//            if(arr[i] > secondLargest) {
//                thirdLargest = secondLargest;
//                secondLargest = arr[i];
//            }
            if(arr[i] < largest && arr[i] < secondLargest && arr[i] > thirdLargest) {
                thirdLargest = arr[i];
            }
        }
   //     System.out.println("Largest is : " + largest);
        System.out.println("Second Largest is : " + thirdLargest);
    }
}
