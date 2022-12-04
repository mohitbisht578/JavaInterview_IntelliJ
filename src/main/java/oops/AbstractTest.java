package oops;

public abstract class AbstractTest {

    public abstract void start();

    public void run() {
        System.out.println("Run 1");
    }
}

class Team extends AbstractTest {

   public void start() {
        System.out.println("Start 2");
    }
    public void run() {
        System.out.println("Run 2");
    }

    public static void main(String[] args) {



    }
}
