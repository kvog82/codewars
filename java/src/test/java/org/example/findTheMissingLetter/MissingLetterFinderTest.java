package org.example.findTheMissingLetter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MissingLetterFinderTest {

    MissingLetterFinder missingLetterFinder = new MissingLetterFinder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of('e', new char[] { 'a','b','c','d','f' }),
                Arguments.of('P', new char[] { 'O','Q','R','S' })
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void missingLetterFinderTest(char expected, char[] input) {
        char result = missingLetterFinder.findMissingLetter(input);

        assertEquals(expected, result);
    }

}