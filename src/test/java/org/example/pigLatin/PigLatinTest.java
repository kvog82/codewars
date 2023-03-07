package org.example.pigLatin;

import org.example.pigLatin.PigLatin;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {

    PigLatin pigLatin = new PigLatin();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("elloHay orldway !", "Hello world !"),
                Arguments.of("igPay atinlay siay oolcay", "Pig latin is cool"),
                Arguments.of("hisTay siay ymay tringsay", "This is my string"),
                Arguments.of("! ? !", "! ? !")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void pigItReturnsPigLatinString(String expected, String input) {
        String actual = pigLatin.pigIt(input);

        assertEquals(expected, actual);
    }

}