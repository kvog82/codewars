package org.example.findTheMissingLetter;

// Find the missing letter: https://www.codewars.com/kata/5839edaa6754d6fec10000a2

public class MissingLetterFinder {
    public char findMissingLetter(char[] array) {
        int arrayIndex = 0;
        int alphabetIndex = array[0];
        char missing = 0;
        while (arrayIndex < array.length) {
            if ((int)array[arrayIndex] != alphabetIndex) {
                missing = (char)alphabetIndex;
                break;
            }
            arrayIndex++;
            alphabetIndex++;
        }
        return missing;
    }
}
