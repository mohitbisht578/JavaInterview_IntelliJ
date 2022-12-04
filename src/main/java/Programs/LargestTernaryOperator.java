package Programs;

public class LargestTernaryOperator {

    public static void main(String[] args) {

        int a = 10;
        int b = 8;
        int c = 15;

        int temp = a>b?a:b;
        int largest = c>temp?c:temp;

        int d = c > (a>b?a:b) ? c:((a>b) ? a:b);
        System.out.println(d);
    }
}
