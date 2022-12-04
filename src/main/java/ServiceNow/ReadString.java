package ServiceNow;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadString {

    public static void main(String[] args) throws Exception{

        File file = new File("/Users/mohitbisht/Desktop/cat.txt");
        String str;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string you want to search");
        String searchWord = sc.nextLine();

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        while((str=br.readLine()) != null) {
            if(str.contains(searchWord)) {
                count++;
                System.out.println(str);
            }
        }
        System.out.println(count);
        br.close();


    }
}
