package Mathematics_Logic;

public class PrintFactors {
    public static void printFactors(int n) {
        System.out.println("Factors of " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int num = 36;
        printFactors(num);
    }
}
