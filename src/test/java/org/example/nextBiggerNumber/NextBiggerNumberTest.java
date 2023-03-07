package org.example.nextBiggerNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NextBiggerNumberTest {

    NextBiggerNumber nextBiggerNumber = new NextBiggerNumber();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(-1, 9),
                Arguments.of(-1, 111),
                Arguments.of(-1, 531),
                Arguments.of(21, 12),
                Arguments.of(531, 513),
                Arguments.of(2071, 2017),
                Arguments.of(441, 414),
                Arguments.of(414, 144),
                Arguments.of(19009, 10990)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void nextBiggerNumberReturnsNumber(long expected, long number) {
        long result = nextBiggerNumber.nextBiggerNumber(number);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void nextBiggerNumberReturnsNumberCodewarsSolution(long expected, long number) {
        long result = nextBiggerNumber.nextBiggerNumberFromCodewars(number);

        assertEquals(expected, result);
    }


}