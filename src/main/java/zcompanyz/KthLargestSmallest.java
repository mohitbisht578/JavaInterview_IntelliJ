package zcompanyz;

public class KthLargestSmallest {

    public static void main(String[] args) {

        int arr[] = {1, 4, 2, 0, 6, 8, 10, 3};
        int k = 4;

        for(int i=0; i<arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (i == k - 1) {
                System.out.println("largest element is " + arr[i]);
                break;
            }
        }

    }
}
