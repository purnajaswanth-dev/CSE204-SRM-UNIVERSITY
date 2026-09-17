import java.util.*;

public class Main {

    static int maxCrossingSum(int[] arr, int low, int mid, int high) {

        int leftSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = mid; i >= low; i--) {

            sum += arr[i];

            leftSum = Math.max(leftSum, sum);
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;

        for (int i = mid + 1; i <= high; i++) {

            sum += arr[i];

            rightSum = Math.max(rightSum, sum);
        }

        return leftSum + rightSum;
    }

    static int maxSubArray(int[] arr, int low, int high) {

        if (low == high)
            return arr[low];

        int mid = low + (high - low) / 2;

        int leftSum = maxSubArray(arr, low, mid);

        int rightSum = maxSubArray(arr, mid + 1, high);

        int crossingSum =
                maxCrossingSum(arr, low, mid, high);

        return Math.max(
                Math.max(leftSum, rightSum),
                crossingSum
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int result = maxSubArray(arr, 0, n - 1);

        System.out.println("Maximum subarray sum = " + result);
    }
}
