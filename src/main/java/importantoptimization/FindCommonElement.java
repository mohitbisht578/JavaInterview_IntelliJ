package importantoptimization;

public class FindCommonElement {

    public static void main(String[] args) {

        int arr1[] = {1, 5, 10 ,20, 25};
        int arr2[] = {7, 10 , 25, 40};

        int x = 0;
        int y = 0;

        while(x < arr1.length && y < arr2.length) {
            if(arr1[x] == arr2[y]) {
                System.out.println(arr1[x]);
                x++;
                y++;
            }
            else if(arr1[x] > arr2[y]) {
                y++;
            }
            else {
                x++;
            }
        }
    }
}
