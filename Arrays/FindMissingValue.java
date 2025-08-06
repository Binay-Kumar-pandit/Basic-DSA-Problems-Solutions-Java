public class FindMissingValue {
    public static int findMissingValue(int[] arr,int n){
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return (int) (expectedSum - actualSum);
    }
    public static void main(String[] args) {
        int[] arr={2,1,4,3,6,7};
        int n=7;
        System.out.println("Missing Value is:"+findMissingValue(arr,n));
    }
}
