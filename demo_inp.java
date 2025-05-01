import java.util.Scanner;

public class demo_inp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] fruits = s.split(" ");

        for(String i : fruits) {
            System.out.println(i);
        }
        
        sc.close();
    }
}
