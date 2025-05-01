import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetImp {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,2,4,5};
        // HashSet<Integer> s = new HashSet<>(Arrays.asList(arr));
        // Set<Integer> s = new HashSet<>(Arrays.asList(arr));
        Set<Integer> s = new LinkedHashSet<>();
        
        // s.addAll(Arrays.asList(arr));
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println(s.add(arr[i]));

        }
        //union
        s1.addAll(s2);
        //intersection
        s1.retainAll(s2);
        //set difference
        s1.removeAll(s2);
        System.out.println();
        System.out.println(s);
    }
}