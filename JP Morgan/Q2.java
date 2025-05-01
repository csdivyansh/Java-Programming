import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1,2,20,8,8,1,2,5,8};
        int[] query = {100, 4, 2};
        ArrayList<Integer> map = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int x = 8;
        for(int i = 0; i < arr.length; i++) {
            if(x == arr[i]) {
                map.add(i);
            }
        }

        for(int i = 0; i < query.length; i++) {
            if(query[i] > map.size()) {
                ans.add(-1);
            } else {
                ans.add(map.get(query[i] - 1));
            }
        }

        System.out.println(ans);
    }
}
