package exceptionHandling;

public class TryCatchFinallyReturn {

    public int method() {
        int div = 0;
        int a = 10, b = 0;

        try {
            div = a/b;
            return div;
        }
        catch(ArithmeticException e){
            return 2;
        }
        finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        TryCatchFinallyReturn t = new TryCatchFinallyReturn();
        System.out.println(t.method());
    }
}
