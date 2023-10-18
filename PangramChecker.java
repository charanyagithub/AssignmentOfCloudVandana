package javaProgrammes;


public class PangramChecker {
    public static boolean isPangram(String input) {
        // Convert the input string to lowercase to handle both uppercase and lowercase letters
        input = input.toLowerCase();
        
        // Create a boolean array to track the presence of each letter
        boolean[] alphabetPresent = new boolean[26];

        // Iterate through the input string and mark the presence of each letter
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabetPresent[index] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are present
        for (boolean present : alphabetPresent) {
            if (!present) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present, so it's a pangram
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

