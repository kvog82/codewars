package org.example.multiplesOf3Or5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesFinderTest {

    MultiplesFinder multiplesFinder = new MultiplesFinder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
            Arguments.of(0, -10),
            Arguments.of(0, 0),
            Arguments.of(0, 1),
            Arguments.of(23, 10),
            Arguments.of(195, 30)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void getSumReturnsSum(int expected, int number) {
        int result = multiplesFinder.find(number);

        assertEquals(expected, result);
    }

}