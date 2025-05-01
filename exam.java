//2
import java.util.*;

class exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        scanner.close();
    }
}
