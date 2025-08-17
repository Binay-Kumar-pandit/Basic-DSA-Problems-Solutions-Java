package Problem_Solving;
import java.util.*;

public class IntersectionOfTwoArray {
    public static List<Integer> findIntersection(int[] arr1,int[] arr2){
        ArrayList<Integer> intersection=new ArrayList<>();
        for(int arr1Element:arr1){
            for(int arr2Element:arr2){
                if(arr1Element==arr2Element){
                    intersection.add(arr1Element);
                }
            }
        }
        return intersection;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,7};
        int[] arr2={5,6,7,8,9,10};
        List<Integer> intersection=findIntersection(arr1,arr2);
        System.out.print("Here are intersect numbers:");
        for(int num:intersection){
            System.err.print(num+" ");
        }
    }
}
