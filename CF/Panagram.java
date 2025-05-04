import java.util.Scanner;
public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] map = new int[26];

        for(char ch : s.toLowerCase().toCharArray()) {
            map[ch - 'a']++;
        }

        for(int i : map) {
            if(i == 0){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
        return;
    }
}
