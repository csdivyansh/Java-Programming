import java.util.*;
import java.util.stream.*;

public class Stream_Imp {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        // int res1 = ls.stream().max();
        int[] arr = {1,2,3,4,5};
        int max = Arrays.stream(arr).max().getAsInt();
        int sum = Arrays.stream(arr).sum();
        System.out.println(max);
        System.out.println(sum);
        // System.out.println(res1);
        Stream.iterate(1,x -> x + 1)
            .filter(x -> x.toString().contains("5"))
            .limit(10)
            .forEach(System.out::println);

        String[] arrx = {"abc", "xyz", "aec"};
        Arrays.stream(arrx)
            .filter(s -> s.startsWith("a"))
            .filter(s -> s.endsWith("c"))
            .sorted()
            .forEach(System.out::println);

    }
}
