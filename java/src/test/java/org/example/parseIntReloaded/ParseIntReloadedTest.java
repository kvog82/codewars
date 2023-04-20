package org.example.parseIntReloaded;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ParseIntReloadedTest {

    ParseIntReloaded parseIntReloaded = new ParseIntReloaded();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(0, "zero"),
                Arguments.of(1, "one"),
                Arguments.of(20, "twenty"),
                Arguments.of(31, "thirty-one"),
                Arguments.of(31, "thirty one"),
                Arguments.of(100, "hundred"),
                Arguments.of(100, "one hundred"),
                Arguments.of(102, "hundred and two"),
                Arguments.of(246, "two hundred forty-six"),
                Arguments.of(1000, "thousand"),
                Arguments.of(1000, "one thousand"),
                Arguments.of(100000, "one hundred thousand"),
                Arguments.of(783919, "seven hundred eighty-three thousand nine hundred and nineteen"),
                Arguments.of(999999, "nine hundred ninety-nine thousand nine hundred ninety-nine"),
                Arguments.of(999000, "nine hundred ninety-nine thousand"),
                Arguments.of(1000000, "one million"),
                Arguments.of(3999999, "three million nine hundred ninety-nine thousand nine hundred ninety-nine"),
                Arguments.of(5000000, "five million")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void parseIntReturnsNumber(int expected, String input) {
        int result = parseIntReloaded.parseInt(input);

        assertEquals(expected, result);
    }

}