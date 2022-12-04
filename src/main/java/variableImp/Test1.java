package variableImp;

public class Test1 {

    static int x = 10;
    int y = 20;

    public static void main(String[] args) {

      Test1 t1 = new Test1();
      t1.x = 888;
      t1.y = 999;
        System.out.println(t1.x);
        System.out.println(t1.y);

      Test1 t2 =new Test1();

        System.out.println(t2.x);
        System.out.println(t2.y);

    }
}
