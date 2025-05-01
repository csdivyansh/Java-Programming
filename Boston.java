import java.util.*;
public class Boston { 
    public static int digitSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n/=10;
        }
        return sum;
    } 

    public static int isBoston(int n) {
        int digitSum = digitSum(n);
        int pfSum = 0;
        int tmp = n;
        while(n != 0) {
            int rem = n % 10;
            digitSum += digitSum(rem);
            n /= 10;
        }

        n = tmp;
        for(int i = 2; i < n; i++) {
            while(n % i == 0) {
                pfSum += digitSum(i);
                n = n / i;
                
            }
        }

        if (n > 1) {
            
            pfSum += digitSum(n);
        }

        pfSum = digitSum(pfSum);
        
        if (digitSum == pfSum) {
            return 1;
        } 

        return 0;
    }



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isBoston(n));
        sc.close();
    }
}

// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         if(isboston(t)){
//         System.out.println(1);
//         }
//         else{
//             System.out.println(0);
//         }
//     }
//     public static boolean isboston(int t){
//         int n=t;
//         int i=2;
//         int sum_fact=0;
//         while(t>1){
//             if(t%i==0){
//                 sum_fact+=digitsum(i);
//                 t/=i;
//             }
//             if(t%i!=0){
//                 i++;
//             }

//         }
//         return digitsum(n)==sum_fact;
//     }
//     public static int digitsum(int n){
//         int sum=0;
//         while(n>0){
//             int rem=n%10;
//             sum+=rem;
//             n/=10;
//         }
//         return sum;
//     }
// }