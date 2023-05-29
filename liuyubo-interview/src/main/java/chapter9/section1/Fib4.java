package chapter9.section1;

/**
 * <p>动态规划
 * <p>自底向上解决问题
 */
public class Fib4 {

    /**
     * <p>斐波那契数列 Fibonacci Sequence
     * <p>F(0) = 0, F(1) = 1, F(n) = F(n - 1) + F(n - 2)
     */
    public static int fib(int n) {
        int[] memo = new int[2];
        memo[0] = 0; // 0 -> 0
        memo[1] = 1; // 1 -> 1

        for (int i = 2; i <= n; i++) {
            memo[i % 2] = memo[i % 2] + memo[(i - 1) % 2];
        }

        return memo[n % 2];
    }

    private static void testTime(int n) {
        double startTime = System.nanoTime();
        System.out.println("fib(" + n + ") = " + fib(n));
        double endTime = System.nanoTime();

        double time = (endTime - startTime) / 1e9;
        System.out.println("Time = " + time + " s");
    }

    public static void main(String[] args) {
        int n = 40;
        testTime(n);
    }
}
