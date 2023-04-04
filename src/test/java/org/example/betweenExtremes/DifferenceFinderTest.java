package org.example.betweenExtremes;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DifferenceFinderTest {

    DifferenceFinder differenceFinder = new DifferenceFinder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(0, new int[] {1}),
                Arguments.of(0, new int[] {0, 0, 0, 0}),
                Arguments.of(20, new int[] {23, 3, 19, 21, 16}),
                Arguments.of(554, new int[] {1, 434, 555, 34, 112}),
                Arguments.of(42, new int[] {21, 34, 54, 43, 26, 12}),
                Arguments.of(200, new int[] {100, -41, -77, -100}),
                Arguments.of(99, new int[] {-1, -41, -77, -100})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void differenceFinderReturnsDifferenceBetweenLowestAndHighest(int expected, int[] input) {
        int result = differenceFinder.findDifferenceBetweenHighestAndLowest(input);

        assertEquals(expected, result);
    }

}