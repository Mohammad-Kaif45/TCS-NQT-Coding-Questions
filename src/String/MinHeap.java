package String;

import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(3);
        minHeap.offer(2);
        minHeap.offer(1);
        minHeap.offer(4);
        minHeap.offer(7);
        minHeap.offer(5);

        System.out.println(minHeap);
        System.out.println(minHeap.poll());
    }
}
