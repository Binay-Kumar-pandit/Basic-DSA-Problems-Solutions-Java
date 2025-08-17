package Strings;

public class StringReverse {
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "hello";
        String reversed = reverseString(str);
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
