package org.example.meanSquare;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MeanSquareCalculatorTest {
    MeanSquareCalculator calc = new MeanSquareCalculator();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(9.0, new int[]{1, 2, 3}, new int[]{4, 5, 6}),
                Arguments.of(16.5, new int[]{10, 20, 10, 2}, new int[]{10, 25, 5, -2}),
                Arguments.of(1.0, new int[]{-1, 0}, new int[]{0, -1})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void calculateReturnsAverage(double expected, int[] arr1, int[]arr2) {
        double result = calc.calculate(arr1, arr2);
        assertEquals(expected, result);
    }

}