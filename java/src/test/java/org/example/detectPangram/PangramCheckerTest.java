package org.example.detectPangram;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PangramCheckerTest {

    PangramChecker pangramChecker = new PangramChecker();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(true, "The quick brown fox jumps over the lazy dog."),
                Arguments.of(false, "You shall not pass!")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void pangramCheckerTest(boolean expected, String sentence) {
        boolean result = pangramChecker.check(sentence);

        assertEquals(expected, result);
    }

}