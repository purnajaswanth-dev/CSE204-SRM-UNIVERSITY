public class Main {
    public static void main(String[] args) {
        double x = 2;
        int n = 5;

        double sum;

        if (x == 1) {
            sum = n + 1;
        } else {
            sum = (Math.pow(x, n + 1) - 1) / (x - 1);
        }

        System.out.println(sum);
    }
}
