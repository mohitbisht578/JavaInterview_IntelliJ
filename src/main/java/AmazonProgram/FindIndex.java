package AmazonProgram;

public class FindIndex {

    public static void main(String[] args) {

        String str[] = {"red", "blue", "oranage", "pink"};
        int index = 0;
        for(int i=0; i< str.length; i++) {
            if(str[i] == "blue") {
                index = i;
            }
        }

        System.out.println(index);
    }
}
