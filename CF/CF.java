package CF;
import java.util.Scanner;

public class CF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int j = 0; j < t; j++) {
            int time;
            String x = sc.next();
            
            if (x.charAt(0) == '0') {
                time = 10;
            } else {
                time = x.charAt(0) - '0';
            }

            int[] arr = new int[x.length()];

            for (int i =0 ; i<x.length();i++) {
                if (x.charAt(i) == '0' ) {
                    arr[i] = 10;
                } else {
                    arr[i] = x.charAt(i) - '0';
                }
            }

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i-1] ) {
                    time++;

                } else {
                    time += Math.abs(arr[i] - arr[i - 1]) + 1; 
                }
                
            }
            System.out.println(time);
        }
        
        sc.close();
    }
}

//yogurt sale

// int n = sc.nextInt();
// int a = sc.nextInt();
// int b = sc.nextInt();
// int regular = n * a;
// int promo = n % 2 == 0 ? b * (n / 2) : (n % 2) * a + b;
// System.out.println(regular < promo ? regular : promo);


//Two Elevators
// for(int j = 0; j < t; j++) {
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();
// int time1 = a - 1;
// int time2 = Math.abs(c - b) + (c - 1);
// if (time1 < time2) {
//     System.out.println(1);
// } else if(time2 == time1) {
//     System.out.println(3);
// } else {
//     System.out.println(2);
// }

// int time = 0;
//             //1236
//             for (int i = 0; i < x.length(); i++) {
//                 int digit = x.charAt(i) - '0';
//                 int prev = 0;
//                 if (digit == 1 && prev == digit) {
//                     time++;

//                 } else if (digit == 0){
//                     time += 10 ;

//                 } else{
//                     time = time + Math.abs(digit-prev);
//                     System.out.println("time : " + time);
//                 }
//                 prev = digit;
//             }
//             System.out.println(time);
