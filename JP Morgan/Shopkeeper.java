import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Shopkeeper {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] quantity = {1, 8, 4};
        for(int i : quantity) {
            pq.add(i);
        } 

        int n = 3, m = 4;
        int max = 0;

        while(m > 0 && !pq.isEmpty()) {
            int currMax = pq.poll();
            max += currMax;

            if(currMax - 1 > 0) {
                pq.add(currMax - 1);
            }
            m--;

        }

        System.out.println(max);
        
    }
}
