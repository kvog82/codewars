package org.example.findTheOddNumber;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

// Find the odd int: https://www.codewars.com/kata/find-the-odd-int

public class OddNumberFinder {
    public int findOdd(int[] array) {
        Map<Integer, Long> numberOccurrences = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy((number -> number), Collectors.counting()));

        Optional<Integer> result = numberOccurrences.entrySet().stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .findFirst();

        return result.orElse(0);
    }
}
