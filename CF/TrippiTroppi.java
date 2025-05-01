import java.util.Scanner;
public class TrippiTroppi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(n-- > 0) {
            sb = new StringBuilder();
            for(int i = 0; i < 3; i++)
                sb.append(sc.next().charAt(0));
            System.out.println(sb.toString());
        }
    }
}
