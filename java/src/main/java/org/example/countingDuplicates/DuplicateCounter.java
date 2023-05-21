package org.example.countingDuplicates;

import java.util.stream.Collectors;

// Counting Duplicates: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1

public class DuplicateCounter {
    public int countDuplicateChars(String text) {
        return (int) text.toLowerCase()
                .chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .count();
    }
}
