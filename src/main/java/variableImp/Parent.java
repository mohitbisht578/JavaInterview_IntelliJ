package variableImp;

public class Parent {

    public static void m1() {
        System.out.println("Parent m1");
    }

    public static void main(String[] args) {

        System.out.println("Parent");
    }
}

class Child extends Parent {

    public static void m1() {
        System.out.println("Child m1");
    }

    public static void main(String[] args) {

        System.out.println("Child");
    }
}
