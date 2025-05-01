import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int count0 = 0;
            int count1 = 0;
            boolean flag = false;
            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(ch == '0') {
                    count1 = 0;
                    count0++;
                } else if(ch == '1'){
                    count0 = 0;
                    count1++;
                }
                if(count1 == 7 || count0 == 7) {
                    flag = true; 
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
