import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int turn = 0;
        while(n > 0) {
            
            if(turn == 0) {
                turn = 1;
                System.out.print("I hate");
            } else {
                turn = 0;
                System.out.print("I love");
            }
            if (n == 1) {
                System.out.print(" it");
            } else {
                System.out.print(" that ");
            }
            n--;
        }
    }
}



