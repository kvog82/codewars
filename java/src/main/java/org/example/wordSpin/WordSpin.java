package org.example.wordSpin;

import java.util.ArrayList;
import java.util.List;

// Stop gninnipS My sdroW!: https://www.codewars.com/kata/5264d2b162488dc400000001

public class WordSpin {
    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        List<String> newWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() >= 5) {
                StringBuilder reversedString = new StringBuilder();
                reversedString.append(word);
                reversedString.reverse();
                word = reversedString.toString();
            }
            newWords.add(word);
        }
        String result = String.join(" ", newWords);
        return result;
    }
}
