package oops;

public class Encapsulat {

    private int emp_id;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }
}

class Te {
    public static void main(String[] args) {

        Encapsulat e = new Encapsulat();
        e.setEmp_id(10);
        System.out.println(e.getEmp_id());
    }
}