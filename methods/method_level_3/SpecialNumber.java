public class SpecialNumber {

    public static boolean isPrime(int n) {

        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static boolean isNeon(int n) {

        int sq = n * n;
        int sum = 0;

        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }

        return sum == n;
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String[] args) {

        int num = 9;

        System.out.println("Prime = " + isPrime(num));
        System.out.println("Neon = " + isNeon(num));
        System.out.println("Buzz = " + isBuzz(num));
    }
}