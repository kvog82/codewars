package org.example.duplicateEncoder;

import java.util.Collections;
import java.util.List;

// Duplicate Encoder: https://www.codewars.com/kata/54b42f9314d9229fd6000d9c

public class DuplicateEncoder {
    public String encode(String word){
        StringBuilder result = new StringBuilder();
        List<Character> chars = word.toLowerCase().chars()
                .mapToObj(character -> (char) character)
                .toList();
        for (char c : chars) {
            if(Collections.frequency(chars, c) == 1) {
                result.append("(");
            } else {
                result.append(")");
            }
        }
        return result.toString();
    }
}
