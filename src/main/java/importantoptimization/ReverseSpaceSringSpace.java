package importantoptimization;

public class ReverseSpaceSringSpace {
    public static void main(String[] args) {
        String str = "hello mohit";
        int len = str.length();
        int p1 = 0;
        int p2 = len-1;

        char ch[] = str.toCharArray();
        while(p1 < p2) {
            if(ch[p1] == ' ') {
                p1++;
                continue;
            }
            else if(ch[p2] == ' ') {
                p2--;
                continue;
            }
            else {
                char temp = ch[p1];
                ch[p1] = ch[p2];
                ch[p2] = temp;
                p1++;
                p2--;
            }
        }
        System.out.println(String.valueOf(ch));

    }
}
