package org.example.anagramDetection;

import java.util.Arrays;

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
