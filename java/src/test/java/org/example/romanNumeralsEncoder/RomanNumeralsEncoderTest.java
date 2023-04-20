package org.example.romanNumeralsEncoder;

import org.example.romanNumeralsEncoder.RomanNumeralsEncoder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsEncoderTest {

    RomanNumeralsEncoder romanNumeralsEncoder = new RomanNumeralsEncoder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("I", 1),
                Arguments.of("IV", 4),
                Arguments.of("VI", 6),
                Arguments.of("MCMXC", 1990),
                Arguments.of("MMVIII", 2008),
                Arguments.of("MDCLXVI", 1666)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void encoderReturnsRomanNumber(String expected, int input) {
        String result = romanNumeralsEncoder.encode(input);

        assertEquals(expected, result);
    }

}