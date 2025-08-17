package Recursion;

public class TowerOfHenoi {
    public static void solveTowerOfHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        solveTowerOfHanoi(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solveTowerOfHanoi(n - 1, auxiliary, destination, source);
    }
    public static void main(String[] args) {
        int numberOfDisks = 3;
        System.out.println("Solving Tower of Hanoi for " + numberOfDisks + " disks:");
        solveTowerOfHanoi(numberOfDisks, 'A', 'C', 'B');
    }
}
