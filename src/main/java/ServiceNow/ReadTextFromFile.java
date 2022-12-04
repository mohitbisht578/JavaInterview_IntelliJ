package ServiceNow;

import java.io.*;
import java.util.Scanner;

public class ReadTextFromFile {

    public static void main(String[] args) throws IOException {

        File file = new File("/Users/mohitbisht/Desktop/cat.txt");
        Scanner sc = new Scanner(System.in);
        String str;
        FileReader fr = null;
        System.out.println("Enter word you want to search");
        String searchWord = sc.nextLine();
        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while((str=br.readLine()) != null) {
                if(str.contains(searchWord)) {
                    System.out.println(str);
                }

            }
        }
        catch (Exception e) {

        }
        finally {
            fr.close();
        }
    }
}
