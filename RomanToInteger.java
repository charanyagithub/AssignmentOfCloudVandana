package javaProgrammes;


import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Create a HashMap to store the values of Roman numerals
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanValues.get(s.charAt(i));
            
            // Check if a smaller numeral appears before a larger one (e.g., "IV" for 4)
            if (i < s.length() - 1) {
                int nextValue = romanValues.get(s.charAt(i + 1));
                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "IX"; // Replace this with the Roman numeral you want to convert
        int intValue = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " = " + intValue);
    }
}

