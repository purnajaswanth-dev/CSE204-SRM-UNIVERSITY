import java.util.*;

public class Main {

    static class Result {
        int min;
        int max;

        Result(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    static Result findMinMax(int[] arr, int low, int high) {

        // One element
        if (low == high) {
            return new Result(arr[low], arr[low]);
        }

        // Two elements
        if (high == low + 1) {

            if (arr[low] < arr[high])
                return new Result(arr[low], arr[high]);
            else
                return new Result(arr[high], arr[low]);
        }

        int mid = low + (high - low) / 2;

        Result left = findMinMax(arr, low, mid);
        Result right = findMinMax(arr, mid + 1, high);

        int min = Math.min(left.min, right.min);
        int max = Math.max(left.max, right.max);

        return new Result(min, max);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Result result = findMinMax(arr, 0, n - 1);

        System.out.println("Minimum = " + result.min);
        System.out.println("Maximum = " + result.max);
    }
}
