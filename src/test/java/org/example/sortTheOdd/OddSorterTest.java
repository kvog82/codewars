package org.example.sortTheOdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class OddSorterTest {

    OddSorter oddSorter = new OddSorter();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{ 1, 7 }, new int[]{ 7, 1 }),
                Arguments.of(new int[]{ 3, 8, 6, 5, 4 }, new int[]{ 5, 8, 6, 3, 4 }),
                Arguments.of(new int[]{ 1, 3, 5, 8, 0 }, new int[]{ 5, 3, 1, 8, 0 }),
                Arguments.of(new int[]{ 1, 8, 3, 6, 5, 4, 7, 2, 9, 0 }, new int[]{ 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 })
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void getSortedArray(int[] expected, int[] inputArray) {
        int[] result = oddSorter.sortArray(inputArray);

        Assertions.assertArrayEquals(expected, result);
    }
}