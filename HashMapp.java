import java.util.HashMap;
import java.util.Map;

public class HashMapp {
    public static void main(String[] args) {
        Integer[] arr = {10,25, 31,8,98,3,10,31};
        HashMap<Integer, Integer> map = new HashMap<>();

        //Traversing the array

        // for(int i = 0; i < arr.length; i++) {
        //     if(map.containsKey(arr[i])) {
        //         map.put(arr[i], map.get(arr[i]) + 1);
        //     }  else {
        //         map.put(arr[i], 1);
        //     }
        //     System.out.println(map);
        // }

        //using one line

        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            // System.out.println(map);
        }

        for (Map.Entry e: map.entrySet()) {
            System.out.println(e.getKey() + " --> " + e.getValue());
        }
    }
}
