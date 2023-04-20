package org.example.findTheUniqueNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class UniqueNumberFinderTest {

    UniqueNumberFinder uniqueNumberFinder = new UniqueNumberFinder();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new double[]{0, 1, 0}, 1.0),
                Arguments.of(new double[]{1, 1, 1, 2, 1, 1}, 2.0),
                Arguments.of(new double[]{ 1, 1, 1, 2, 1, 1 }, 2),
                Arguments.of(new double[]{ 0, 0, 0.55, 0, 0 }, 0.55)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void UniqueNumberFinderFindsUniqueNumber(double[] input, double expected) {
        double result = uniqueNumberFinder.findUniqueNumber(input);

        Assertions.assertEquals(expected, result);
    }

}