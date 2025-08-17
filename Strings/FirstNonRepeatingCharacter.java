package Strings;

public class FirstNonRepeatingCharacter {
    public static char firstNonRepeatingCharacter(String str) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        for (char ch : str.toCharArray()) {
            charCount[ch]++;
        }

        for (char ch : str.toCharArray()) {
            if (charCount[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // Return null character if no non-repeating character found
    }

    public static void main(String[] args) {
        String str = "swiss";
        char result = firstNonRepeatingCharacter(str);
        if (result != '\0') {
            System.out.println("First non-repeating character in \"" + str + "\" is: " + result);
        } else {
            System.out.println("No non-repeating character found in \"" + str + "\".");
        }
    }   
}
