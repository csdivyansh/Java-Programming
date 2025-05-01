import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(27);
        pq.add(217);
        pq.add(27);
        pq.add(2);
        pq.add(-27);
        pq.add(37);
        
        System.out.println(pq.poll()); // 
        System.out.println(pq.poll());
    }
}
