package Mathematics_Logic;

public class LCM {
    //multiple numbers of lcm
    public static int findLCMofArray(int[] nums) {
        int lcm = nums[0];
        for (int i = 1; i < nums.length; i++) {
            lcm = findLCM(lcm, nums[i]);
        }
        return lcm;
    }

    // Euclidean Algorithm  GCD ko lagi;
    public static int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }

    // LCM nikalne function
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println("LCM of " + a + " and " + b + " is: " + findLCM(a, b));
    }
}
