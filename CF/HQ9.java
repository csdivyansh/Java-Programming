import java.util.Scanner;
public class HQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = false;
        for(char i : s.toCharArray()) {
            if(i == 'H' || i == 'Q' || i == '9') {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "YES" : "NO");
    }
}
