/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {21,54,56,73,6,7,9,3,77,37,45,76,0};
        int n = arr.length;

        for(int pass = 1; pass < n; pass++) {
            for(int i = 0; i < n - 1 - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for(int i: arr) {
            System.out.print(i + " ");
        }
    }
}