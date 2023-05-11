package org.example.isANumberPrime;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberCheckerTest {

    PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(false, 0),
                Arguments.of(false, 1),
                Arguments.of(true, 2),
                Arguments.of(true, 73),
                Arguments.of(false, -1),
                Arguments.of(false, 209641441)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void primeNumberCheckerReturnsBoolean(boolean expected, int input) {
        boolean actual = primeNumberChecker.isPrime(input);

        assertEquals(expected, actual);
    }
}