package oops;

public class P {

    public void m1() {
        System.out.println("P");
    }
}

class C extends P {
    public void m2() {
        System.out.println("C");
    }
}

class Demo {
    public static void main(String[] args) {
        P p = new P();
        p.m1();
        C c = new C();
        c.m2();
        c.m1();
    }
}
