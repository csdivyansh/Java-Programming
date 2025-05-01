import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class DataStructureDemo1 {
    public static void main(String[] args) {
        int[] arr = {4,46,55,35,3,53,57,5,36,5,645};
        Arrays.stream(arr)
        .filter(ele -> ele % 2 == 0)
        .forEach(System.out::println);

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        long count = Arrays.stream(arr).distinct().count();
        System.out.println(count);

        int addOdd = Arrays.stream(arr).filter(ele -> ele % 2 != 0).sum();
        System.out.println("Odd add" + addOdd);

        int addEven = Arrays.stream(arr).filter(ele -> ele % 2 == 0).sum();
        System.out.println("Even add" + addEven);

        IntStream stream = Arrays.stream(arr);
        OptionalInt max = stream.max();
        // int max2 = stream.max().getAsInt();
        System.out.println("Max as optional int = " + max);

        //Ctrl + Shift + O 

        Arrays.stream(arr).sorted().forEach(var -> System.out.printf("%d ", var));
        System.out.println("\n" + arr[0]);

        Arrays.stream(arr)
        .sorted()
        .filter(ele -> ele % 5 == 0)
        .forEach(var -> System.out.printf("%d ", var));

        System.out.println();
        String[] strarr = {"34", "56", "3", "12", "54", "25"};
        Arrays.stream(strarr)
        .mapToInt(Integer::parseInt)
        .forEach(ele -> System.out.printf("%d ", ele));
    }
}

