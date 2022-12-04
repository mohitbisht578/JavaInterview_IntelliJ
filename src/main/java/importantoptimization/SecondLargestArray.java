package importantoptimization;

public class SecondLargestArray {

    //TC-0(n)
    public static void main(String[] args) {
        int arr[] = {1, 4};
        int len = arr.length;
        if(len <= 1){
            return;
        }
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
        System.out.println("Largest element in an array is : " + largest);
        System.out.println("Second Largest element in an arrya is : " + secondLargest);
    }
}
