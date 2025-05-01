import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;

public class TreeSett {
    public static void main(String[] args) {
        Integer[] arr = {10,25,31,8,98,3};
        TreeSet<Integer> s1 = new TreeSet<Integer>();
        s1.addAll(Arrays.asList(arr));
        System.out.println(s1);
        System.out.println(s1.lower(30));
        System.out.println(s1.floor(50));
        System.out.println(s1.higher(50));
        System.out.println(s1.ceiling(50));
        System.out.println(s1.first());
        System.out.println(s1.headSet(30));
        System.out.println(s1.tailSet(30));
    }
}