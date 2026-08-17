public class Main {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        long sum = 0;
        long term = 1;

        for (int i = 0; i <= n; i++) {
            sum += term;
            term *= x;
        }

        System.out.println(sum);
    }
}
