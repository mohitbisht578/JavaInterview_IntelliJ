package oops;

public interface InterfaceA {

    default void show() {
        System.out.println("Interface A show method");
    }
}

interface InterfaceB {

    default void show() {
        System.out.println("Interface B show method");
    }

}

class Test implements InterfaceA, InterfaceB {

    //override
    public void show() {
        InterfaceA.super.show();
        InterfaceB.super.show();
    }

    public static void main(String[] args) {

        Test t =  new Test();
        t.show();
    }
}