package org.example.scramblies;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CharacterCheckerTest {

    CharacterChecker characterChecker = new CharacterChecker();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(true, "rkqodlw","world"),
                Arguments.of(true, "cedewaraaossoqqyt","codewars"),
                Arguments.of(false, "katas","steak"),
                Arguments.of(false, "scriptjavx","javascript"),
                Arguments.of(true, "scriptingjava","javascript"),
                Arguments.of(true, "scriptsjava","javascripts"),
                Arguments.of(false, "javscripts","javascript"),
                Arguments.of(true, "aabbcamaomsccdd","commas"),
                Arguments.of(true, "commas","commas"),
                Arguments.of(true, "sammoc","commas")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void characterCheckerTest(boolean expected, String string1, String string2) {
        boolean result = characterChecker.checkScramble(string1, string2);

        assertEquals(expected, result);
    }
}