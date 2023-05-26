package org.example.equalSidesOfAnArray;

import java.util.stream.IntStream;

// Equal Sides of an Array: https://www.codewars.com/kata/5679aa472b8f57fb8c000047

public class EvenIndexFinder {
    public int findEvenIndex(int[] arr) {
        return IntStream.range(0, arr.length)
                .filter(i -> sum(arr, 0, i - 1) == sum(arr, i + 1, arr.length - 1))
                .findFirst()
                .orElse(-1);
    }

    private int sum(int[] arr, int start, int end) {
        return IntStream.rangeClosed(start, end)
                .map(i -> arr[i])
                .sum();
    }
}
