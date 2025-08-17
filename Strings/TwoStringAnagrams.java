package Strings;

public class TwoStringAnagrams {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[26]; // Assuming only lowercase letters a-z

        for (char ch : str1.toCharArray()) {
            charCount[ch - 'a']++;
        }

        for (char ch : str2.toCharArray()) {
            charCount[ch - 'a']--;
            if (charCount[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        str1 = "fire";
        str2 = "water";
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
