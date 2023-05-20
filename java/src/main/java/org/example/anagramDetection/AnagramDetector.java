package org.example.anagramDetection;

import java.util.Arrays;

// Anagram Detection: https://www.codewars.com/kata/529eef7a9194e0cbc1000255

public class AnagramDetector {
    public boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) {
            return false;
        }
        char[] testArray = test.toLowerCase().toCharArray();
        char[] originalArray = original.toLowerCase().toCharArray();
        Arrays.sort(testArray);
        Arrays.sort(originalArray);
        return Arrays.equals(testArray, originalArray);
    }
}
