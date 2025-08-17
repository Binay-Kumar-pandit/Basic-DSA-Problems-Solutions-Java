package Searching_Sorting;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        return binarySearchHelper(arr, target, 0, arr.length - 1);
    }
    private static int binarySearchHelper(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Target not found
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] < target) {
            return binarySearchHelper(arr, target, mid + 1, right); // Search in the right half
        } else {
            return binarySearchHelper(arr, target, left, mid - 1); // Search in the left half
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
