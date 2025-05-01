import java.util.*;
import java.util.stream.*;

public class OnlyEven_ArrayList {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> ls = Arrays.asList(arr);
        List<Integer> even = new ArrayList<Integer>();

        for(Integer i : ls) {
            if (i%2 == 0) {
                even.add(i);
            }
        }

        List<Integer> res = ls.stream().map(x-> x* x).filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(res);
    }
}
