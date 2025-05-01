public class Subarray {
    public static void main(String[] args) {
        int maxSubarraySum(int[] arr) {

            int max_sum = Integer.MIN_VALUE;
            for(int start = 0; start < arr.length; start++) {
                for(int end = start; end < arr.length; end++) {
                    int sum = 0;
                    for(int k = start; k < end; k++) {
                        sum += arr[k];
                    }
                    max_sum = Math.max(max_sum, sum);
                }
                
            }        
            
            return max_sum;
        }
    }
}


// int max_sum = Integer.MIN_VALUE;
// for(int start = 0; start < arr.length; start++) {
//     int sum = 0;
//     for(int end = start; end < arr.length; end++) {
//         sum += arr[end];
//         max_sum = Math.max(max_sum, sum);
//     }
    
// }

// return max_sum;

//Kadane's Algo
// int maxSubarraySum(int[] arr) {

// int sum = 0;
// int max_sum = Integer.MIN_VALUE;
// for(int i = 0; i < arr.length; i++) {
//     sum += arr[i];
//     max_sum = Math.max(sum, max_sum);

//     if (sum < 0) {
//         sum = 0;
//     }

// }

// return max_sum;
// // }
// n/math.pow(5, i)

// sum += 