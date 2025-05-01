class SecondMax {
    public static int sec_max(int[] arr) {
        int max = arr[0];
        int s_max = Integer.MIN_VALUE;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cnt < arr.length - 1 && arr[i] == arr[i+1])
                cnt++;
            if (arr[i] > max) {
                s_max = max;
                max = arr[i];
            } else if (arr[i] > s_max && arr[i] != max){
                s_max = arr[i];
            }
        }

        if (++cnt == arr.length) {
            return -1;
        }

        return s_max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(sec_max(arr));
    }
}