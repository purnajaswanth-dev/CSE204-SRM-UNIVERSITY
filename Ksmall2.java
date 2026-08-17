import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);
        }

        for (int i = 1; i < k; i++) {
            minHeap.poll();
        }

        System.out.println(minHeap.peek());
    }
}
