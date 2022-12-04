package oops;

public class Parent {

    void show() {

        System.out.println("A");
    }
}

class Parent2 extends Parent{

    void show() {
        super.show();
    }
}

class Parent3 extends Parent{

    void show() {
       super.show();
    }

    public static void main(String[] args) {

        Parent3 obj = new Parent3();
        obj.show();
    }

}

