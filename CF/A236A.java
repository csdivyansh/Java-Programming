package CF;
import java.util.*;
class A236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        HashSet<Character> set= new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!set.contains(ch)) {
                set.add(ch);
            }

        }
        
        System.out.println((set.size() % 2 == 0) ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}
