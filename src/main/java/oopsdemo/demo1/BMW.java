package oopsdemo.demo1;

import oopsdemo.Car;

public class BMW extends Car {

    protected void start() {

        System.out.println("BMW Start");
    }
}

class Test {
    public static void main(String[] args) {

        BMW b = new BMW();
        b.start();
    }
}
