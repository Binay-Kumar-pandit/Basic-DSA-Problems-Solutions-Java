public class SecondLargest {
    public static int FindSecondLargest(int[] arr){
        int firstLargest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        for (int value : arr) {
            if(firstLargest<value){
                SecondLargest=firstLargest;
                firstLargest=value;
            }
        }
        return SecondLargest;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("Second Largest:"+FindSecondLargest(arr));
    }
}
