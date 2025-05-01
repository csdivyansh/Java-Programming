import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        int i = 1;
        while(i < n) {
            if (s.charAt(i) == s.charAt(i - 1))
                count++;
            i++;
        }
        System.out.println(count);
    }
    
}