import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        sc.close();
        if(s.length != t.length){
            System.out.println("NO");
            return;
        }
        boolean flag = true;
        for(int i = 0; i < s.length; i++) {
            if(s[i] != t[s.length - 1 - i]) {
                flag = false;
            }
        }
        System.out.println(flag ? "YES" : "NO");
        
    }   
}