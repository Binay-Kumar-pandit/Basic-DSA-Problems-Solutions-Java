package Strings;

public class CountVowels_and_Consunant {
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        String lowerStr = str.toLowerCase();

        for (char ch : lowerStr.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
