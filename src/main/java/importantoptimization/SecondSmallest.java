package importantoptimization;

public class SecondSmallest {

    public static void main(String[] args) {

        int arr[] = {1, 4, 0 ,2, 0, 1};
        int len = arr.length;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
            if(arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("Smallest element is : " + smallest);
        System.out.println("Second smallest element is : " + secondSmallest);
    }
}
