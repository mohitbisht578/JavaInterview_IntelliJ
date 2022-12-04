package ArrayProgram;

public class Spaces {

    public static void main(String[] args) {

        String str = "my      java    is   programming";

        str = str.replaceAll("\\s+", " ");

        System.out.println(str);

    }
}
