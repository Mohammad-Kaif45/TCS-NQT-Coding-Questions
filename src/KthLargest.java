import java.util.PriorityQueue;

public class KthLargest {
    public static int kthLargest(int[] nums,int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) {
            pq.offer(num);
            if (pq.size() > k) pq.poll();
        }
        return pq.peek(); // return peak
    }
    public static void main(String[] args) {
        int[] nums = {3,7,1,2,9,6};
        int result = kthLargest(nums,2);
        System.out.println("Kth Largest element in an array is : " + result);
    }
}
