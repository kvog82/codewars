package org.example.mexicanWave;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MexicanWaveTest {

    MexicanWave mexicanWave = new MexicanWave();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new String[] { "Hello", "hEllo", "heLlo", "helLo", "hellO" }, "hello"),
                Arguments.of(new String[] { "Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS" }, "codewars"),
                Arguments.of(new String[] {}, ""),
                Arguments.of(new String[] { "Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS" }, "two words"),
                Arguments.of(new String[] { " Gap ", " gAp ", " gaP " }, " gap ")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void waveReturnsWavedArray(String[] expected, String input) {
        String[] actual = mexicanWave.wave(input);

        assertArrayEquals(expected, actual);
    }

}