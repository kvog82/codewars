package org.example.betweenExtremes;

import java.util.Arrays;
import java.util.List;

// Between Extremes: https://www.codewars.com/kata/56d19b2ac05aed1a20000430

public class DifferenceFinder {
    public int findDifferenceBetweenHighestAndLowest(int[] numbers) {
        List<Integer> numbersList = Arrays.stream(numbers).boxed().toList();
        int min = numbersList.stream().min(Integer::compare).get();
        int max = numbersList.stream().max(Integer::compare).get();
        return max-min;
    }
}
