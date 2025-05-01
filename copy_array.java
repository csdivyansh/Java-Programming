public class copy_array {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        int[] brr = new int[arr.length];
        System.arraycopy(arr, 0, brr, 0, arr.length);
        for (int ele : brr) {
            System.out.println(ele);
        }
    }
}
