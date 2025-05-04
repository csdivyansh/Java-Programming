import java.util.Scanner;

public class ABAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            char[] s = sc.next().toCharArray();
            System.out.println(s[0] - '0' + s[1] - '0');
        }
    }
}
