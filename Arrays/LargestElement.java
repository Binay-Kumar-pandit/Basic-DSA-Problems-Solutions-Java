public class LargestElement{
    public static int FindLargestElement(int[] arr){
        int largestElement=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largestElement<arr[i]){
                largestElement=arr[i];
            }
        }
        return largestElement;
    }
    public static void main(String[] args) {
        int[] array={3,5,3,2,5,7,8,5,7,8,10,29,3,2};
        System.out.println("Largest Element is:"+FindLargestElement(array));
    }
}


//Time Complexity:- On
//Space Complexity:- O1