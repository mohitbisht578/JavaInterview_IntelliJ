package oops;

public class Base {

    public void m1() {
        System.out.println("Base m1");
    }

    public static void m2() {
        System.out.println("Base static m1");
    }
}

class Derived extends Base {

    public void m1() {
        System.out.println("Derived m1");
    }

    public static void m2() {
        System.out.println("Derived static m2");
    }
}

class T {
    public static void main(String[] args) {
        Base b = new Base();
        b.m1();
        b.m2();
        System.out.println("----");

        Derived d = new Derived();
        d.m1();
        d.m2();

        System.out.println("-----");
        Base b1 = new Derived();
        b1.m1();
        b1.m2();
    }
}
