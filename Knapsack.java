import java.util.*;

public class Main {

    static class Item {
        int value;
        int weight;
        double ratio;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
            this.ratio = (double) value / weight;
        }
    }

    static double fractionalKnapsack(
            int capacity,
            Item[] items) {

        Arrays.sort(
            items,
            (a, b) -> Double.compare(b.ratio, a.ratio)
        );

        double totalValue = 0;

        for (Item item : items) {

            if (capacity == 0)
                break;

            if (item.weight <= capacity) {

                capacity -= item.weight;

                totalValue += item.value;

            } else {

                double fraction =
                        (double) capacity / item.weight;

                totalValue += item.value * fraction;

                capacity = 0;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();
            int weight = sc.nextInt();

            items[i] = new Item(value, weight);
        }

        int capacity = sc.nextInt();

        double result =
                fractionalKnapsack(capacity, items);

        System.out.println(
                "Maximum value = " + result
        );
    }
}
