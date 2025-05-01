import java.util.*;

public class ArrayList_imp {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        // Integer[] arr = new Integer[5];
        List<Integer> ls = Arrays.asList(arr);
        // Collections.sort(ls);
        // Object[] arr1 = ls.toArray();
        // System.out.println(ls);
        // for(Object i : arr1) {
        //     System.out.println(i);
        // }

        // Integer[] arr1 = new Integer[3];
        // arr1 = ls.toArray(arr1); // List to array conversion

        // for(Integer i : arr1) {
        //     System.out.println(i);
        // }
        // ls.add(10);
        // ls.add(null);

        // Integer arr1[] = ls.toArray(new Integer[0]);

        // for(Integer i : arr1) {
        //     System.out.println(i);
        // }
        // MyArrayList ls = new MyArrayList();
        // ls.add(10);
        // ls.add(20);
        // ls.add(30);
        // ls.add(40);
        // ls.remove();
        // ls.remove();
        // ls.display();

        //ForEach methods
        // ls.forEach(x -> System.out.println(x * x));
        // ls.forEach(System.out::println);
        ls.stream().forEach(System.out::println);
    }
}
