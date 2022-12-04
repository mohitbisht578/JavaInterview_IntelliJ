package constrcutortest;

public class Student {

    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {

        Student s = new Student("Mohit", 101);
        System.out.println(s.name + " : " + s.rollNo);
    }
}
