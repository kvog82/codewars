package org.example.countingDuplicates;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateCounterTest {
    DuplicateCounter duplicateCounter = new DuplicateCounter();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(0, "abcde"),
                Arguments.of(1, "abcdea"),
                Arguments.of(1, "indivisibility")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void duplicateCounterTest(int expected, String input) {
        int actual = duplicateCounter.countDuplicateChars(input);

        assertEquals(expected, actual);
    }

}