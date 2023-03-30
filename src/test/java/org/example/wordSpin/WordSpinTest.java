package org.example.wordSpin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WordSpinTest {

    WordSpin wordSpin = new WordSpin();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("Welcome", "emocleW"),
                Arguments.of("Hey fellow warriors", "Hey wollef sroirraw"),
                Arguments.of("This is a test", "This is a test"),
                Arguments.of("This is another test", "This is rehtona test")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void spinWords(String input, String expected) {
        String result = wordSpin.spinWords(input);

        Assertions.assertEquals(expected, result);
    }
}