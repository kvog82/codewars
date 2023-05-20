package org.example.bitCounting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BitCounterTest {
    BitCounter bitCounter = new BitCounter();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(5, 1234),
                Arguments.of(1, 4),
                Arguments.of(3, 7),
                Arguments.of(2, 9),
                Arguments.of(2, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void bitCounterReturnsCountOfOnes(int expected, int inputNumber) {
        int actual = bitCounter.countBits(inputNumber);

        assertEquals(expected, actual);
    }
}