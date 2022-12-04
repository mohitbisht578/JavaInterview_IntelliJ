package mondayinterview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadTextFile {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("/Users/mohitbisht/Desktop/cat.txt");
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string you want to search");
        String searchWord = sc.nextLine();
        BufferedReader br = new BufferedReader(fr);

        while((str=br.readLine()) != null) {
            if(str.contains(searchWord)) {
                System.out.println(str);
            }
        }

    }
}
