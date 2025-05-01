import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String insc = sc.next() + sc.next();
        String pile = sc.next();
        int[] map= new int[26];

        for(char ch : insc.toCharArray()) {
            map[ch - 'A']++;
        }

        for(char ch : pile.toCharArray()) {
            map[ch - 'A']--;
        }

        for(int i : map) {
            if(i != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    
}

