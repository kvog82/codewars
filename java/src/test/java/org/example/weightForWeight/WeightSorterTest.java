package org.example.weightForWeight;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WeightSorterTest {

    WeightSorter weightSorter = new WeightSorter();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("100 180 90 56 65 74 68 86 99", "56 65 74 100 99 68 86 180 90"),
                Arguments.of("2000 103 123 4444 99", "103 123 4444 99 2000"),
                Arguments.of("11 11 2000 10003 22 123 1234000 44444444 9999", "2000 10003 1234000 44444444 9999 11 11 22 123")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void weightSorterReturnsSortedString(String expected, String input) {
        String actual = weightSorter.orderWeights(input);

        assertEquals(expected, actual);
    }

}