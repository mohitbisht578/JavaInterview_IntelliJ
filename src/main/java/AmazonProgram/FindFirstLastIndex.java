package AmazonProgram;

public class FindFirstLastIndex {

    public static void main(String[] args) {

        //0(n)
        int arr[] = {1, 4, 7, 8, 11, 11, 11, 11, 11, 15};
        int search = 11;
        int firstIndex = -1;
        int lastIndex = -1;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == search && firstIndex == -1) {
                firstIndex = i;
            }
            if(arr[i] == search && firstIndex != -1) {
                lastIndex = i;
            }
        }

        System.out.println(firstIndex);
        System.out.println(lastIndex);
    }
}
