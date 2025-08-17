package Problem_Solving;

public class DuplicatesInAnArray {
    public static int[] findDuplicates(int arr[]){
        int[] duplicates=new int[arr.length];
        int k=0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    duplicates[k++]=arr[i];
                }
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1,4,5,5,7,8,9,7};
        int[] duplicates=findDuplicates(arr);

        System.out.print("Here are all duplicates:");
        for(int i=0; i<duplicates.length; i++){
            if(duplicates[i]!=0){
                System.out.print(duplicates[i]+" ");
            }
        }
    }
}
