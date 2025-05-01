import java.util.*;

public class Binary_Search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50, 60};
        int k = 60;
        int end = arr.length - 1;
        int start = 0;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == k) {
                System.out.println("Found at index: " + mid);
                break;
            } else if (arr[mid] > k) {
                end = mid ;
            } else {
                start = mid;
            }
        }

        sc.close();

    }
}