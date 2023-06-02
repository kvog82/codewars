package org.example.deleteOccurrencesOfAnElement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ElementDeleterTest {

    ElementDeleter elementDeleter = new ElementDeleter();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new int[] { 20, 37, 21 }, new int[] { 20, 37, 20, 21 }, 1),
                Arguments.of(new int[] { 1, 1, 3, 3, 7, 2, 2, 2 }, new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3),
                Arguments.of(new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 }, new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3),
                Arguments.of(new int[] { 1, 1, 1, 1, 1 }, new int[] { 1, 1, 1, 1, 1 }, 5),
                Arguments.of(new int[] { }, new int[] { }, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void returnsCleanedArray(int[] expected, int[] input, int maxOccurrences) {
        int[] result = elementDeleter.deleteNth(input, maxOccurrences);

        assertArrayEquals(expected, result);
    }
}