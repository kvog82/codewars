package org.example.twoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    static Stream<Arguments> parameters() {
        return Stream.of(
                arguments(new int[]{1, 2, 3}, 4, new int[]{0, 2}),
                arguments(new int[]{1234, 5678, 9012}, 14690, new int[]{1, 2}),
                arguments(new int[]{2, 2, 3}, 4, new int[]{0, 1}),
                arguments(new int[]{2, 3, 1}, 4, new int[]{1, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void twoSum(int[] numbers, int target, int[] expected) {
        int[] result = twoSum.twoSum(numbers, target);

        Assertions.assertArrayEquals(expected, result);
    }
}