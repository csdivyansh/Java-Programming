import java.util.Scanner;

public class countVowels {
    public static int countVowel (String s) {
        int cnt = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u') {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] fruits = line.split(" ");

        for(String i : fruits) {
            System.out.println(new StringBuilder(i).reverse().toString() + "\tVowel Count = " + countVowel(i));
        }
        sc.close();
        
    }
}
