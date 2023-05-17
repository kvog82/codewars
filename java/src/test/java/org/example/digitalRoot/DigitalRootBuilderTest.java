package org.example.digitalRoot;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DigitalRootBuilderTest {

    DigitalRootBuilder digitalRootBuilder = new DigitalRootBuilder();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(7, 16),
                Arguments.of(6, 456),
                Arguments.of(6, 942),
                Arguments.of(6, 132189),
                Arguments.of(2, 493193)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void buildDigitalRootReturnsDigitalRoot(int expected, int inputNumber) {
        int result = digitalRootBuilder.buildDigitalRoot(inputNumber);

        assertEquals(expected, result);
    }

}