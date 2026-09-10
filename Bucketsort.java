import java.util.*;

public class Main {

    static void bucketSort(int[] arr) {

        if (arr.length == 0)
            return;

        int max = arr[0];

        for (int x : arr)
            max = Math.max(max, x);

        int bucketCount = (int) Math.sqrt(arr.length) + 1;

        ArrayList<Integer>[] buckets =
                new ArrayList[bucketCount];

        for (int i = 0; i < bucketCount; i++)
            buckets[i] = new ArrayList<>();

        // Distribute elements into buckets
        for (int x : arr) {

            int index =
                    (int) ((long) x * bucketCount / (max + 1L));

            buckets[index].add(x);
        }

        // Sort individual buckets
        for (ArrayList<Integer> bucket : buckets)
            Collections.sort(bucket);

        // Combine buckets
        int index = 0;

        for (ArrayList<Integer> bucket : buckets) {

            for (int x : bucket)
                arr[index++] = x;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        bucketSort(arr);

        System.out.println("Sorted array:");

        for (int x : arr)
            System.out.print(x + " ");
    }
}
