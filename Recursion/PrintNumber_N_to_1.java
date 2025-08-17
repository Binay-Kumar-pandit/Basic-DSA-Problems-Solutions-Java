package Recursion;

public class PrintNumber_N_to_1 {
    public static void printNumbers(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        printNumbers(n - 1);
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.print("Numbers from " + number + " to 1: ");
        printNumbers(number);
        System.out.println(); 
    }
}
