public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        // for(int i = 0; i < n; i++) {
        //     System.out.println(arr[i]);
        //     int sum = arr[i];
        //     for(int j = i; j < n; j++) {
        //         System.out.println(sum + arr[j]);
        //     }
        // }

        for(int start = 0; start < n; start++) {
            for(int end = start; end < n; end++) {
                int sum = 0;
                for(int i = start; i <= end; i++) {
                    sum += arr[i];
                }
                System.out.println(sum);
            }
        }
    }
}
