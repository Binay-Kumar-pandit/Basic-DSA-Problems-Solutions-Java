package Mathematics_Logic;

public class CheckPrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=5;
        String message=isPrime(n)?" is a prime number.":" is not a prime number.";
        System.out.println(n+message);
    }
}
