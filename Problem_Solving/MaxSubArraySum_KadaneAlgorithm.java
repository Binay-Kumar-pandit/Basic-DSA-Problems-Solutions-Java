package Problem_Solving;

class MaxSubArraySum_KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr={1,3,-2,4,5,3,44};
        

        //finding maximum sub array sum using kadane algorithm
        int currentSum=0;
        int maxSum=arr[0];
        for(int i=0; i<arr.length; i++){
            currentSum=Math.max(arr[i],currentSum+arr[i]);
            maxSum=Math.max(maxSum,currentSum);
        }

        System.out.println("Maximun sub array sum is:"+maxSum);
    }
    
}