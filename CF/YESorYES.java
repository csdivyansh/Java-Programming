import java.util.Scanner;
public class YESorYES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            System.out.println(sc.next().toLowerCase().equals("yes") ? "YES" : "NO");
        }
    }
}
