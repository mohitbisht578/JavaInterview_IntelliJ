package oops;

public class InheritanceA {

    int wheels;
    String name;
}

class Car extends InheritanceA {

    public Car(int wheels) {
        super.wheels = wheels;
        System.out.println(wheels);
    }
}

class Bus extends InheritanceA {

    public Bus() {
        super.wheels = wheels;
      System.out.println(wheels);
    }
}

class Pe {
    public static void main(String[] args) {
        Car c = new Car(10);
        Bus b = new Bus();
    }
}