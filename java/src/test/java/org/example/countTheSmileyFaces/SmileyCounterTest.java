package org.example.countTheSmileyFaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SmileyCounterTest {

    SmileyCounter smileyCounter = new SmileyCounter();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(2, List.of(":)", ";(", ";}", ":-D")),
                Arguments.of(3, List.of(";D", ":-(", ":-)", ";~)")),
                Arguments.of(1, List.of(";]", ":[", ";*", ":$", ";-D")),
                Arguments.of(1, List.of(":)", "XD", ":0}", "x:-", "D:"))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void smileyCounterReturnsSum(int expected, List<String> input) {
        int result = smileyCounter.countSmileys(input);

        assertEquals(expected, result);
    }

}