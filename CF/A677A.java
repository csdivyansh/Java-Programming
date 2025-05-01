package CF;
import java.util.*;

public class A677A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int sum = 0;
        for(int i : arr) {
            if (i <= h) {
                sum += 1;
            } else if (i > h){
                sum += 2;
            }
        }

        System.out.println(sum);
    }
}