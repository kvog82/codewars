package org.example.persistentBugger;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DigitsMultiplierTest {
    DigitsMultiplier digitsMultiplier = new DigitsMultiplier();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(3, 39),
                Arguments.of(0, 4),
                Arguments.of(2, 25),
                Arguments.of(4, 999)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void multiplierReturnsNumberOfMultiplications(int expected, long inputNumber) {
        int result = digitsMultiplier.persist(inputNumber);

        assertEquals(expected, result);
    }

}