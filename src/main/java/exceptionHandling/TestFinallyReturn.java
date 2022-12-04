package exceptionHandling;

public class TestFinallyReturn {

    public static String returnMethod(boolean isTrue) {

        try {
            if(isTrue) {
                throw new Exception();
            }
            return "frome try block";
        }
        catch (Exception e) {
            return "From catch block";
        }
        finally {
            return "From finally block";
        }
    }

    public static void main(String[] args) {
        String str = returnMethod(true);
        System.out.println(str);
    }
}
