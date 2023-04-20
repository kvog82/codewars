package org.example.numbersExpandedForm;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class NumberExpanderTest {
    NumberExpander expander = new NumberExpander();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of("", 0),
                of("10 + 2", 12),
                of("70000 + 300 + 4", 70304),
                of("9000000", 9000000)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void expandedForm(String expected, int number) {
        String result = expander.expandedForm(number);
        assertEquals(expected, result);
    }


}