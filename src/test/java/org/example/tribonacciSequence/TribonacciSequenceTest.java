package org.example.tribonacciSequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TribonacciSequenceTest {

    TribonacciSequence tribonacciSequence = new TribonacciSequence();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new double []{1}, new double []{1,1,1}, 1),
                Arguments.of(new double []{20.0, 4.0}, new double []{20.0, 4.0, 17.0}, 2),
                Arguments.of(new double []{1,1,1,3,5,9,17,31,57,105}, new double []{1,1,1}, 10),
                Arguments.of(new double []{0,0,1,1,2,4,7,13,24,44}, new double []{0,0,1}, 10),
                Arguments.of(new double []{0,1,1,2,4,7,13,24,44,81}, new double []{0,1,1}, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void buildTribonacciSequenceReturnsArray(double[] expected, double[] input, int expectedLength) {
        double[] result = tribonacciSequence.buildTribonacciSequence(input, expectedLength);

        Assertions.assertArrayEquals(expected, result);
    }
}