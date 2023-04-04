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
                Arguments.of(new int[] {1}, 0),
                Arguments.of(new int[] {0, 0, 0, 0}, 0),
                Arguments.of(new int[] {23, 3, 19, 21, 16}, 20),
                Arguments.of(new int[] {1, 434, 555, 34, 112}, 554),
                Arguments.of(new int[] {21, 34, 54, 43, 26, 12}, 42),
                Arguments.of(new int[] {100, -41, -77, -100}, 200),
                Arguments.of(new int[] {-1, -41, -77, -100}, 99)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void differenceFinderReturnsDifferenceBetweenLowestAndHighest(int[] input, int expected) {
        int result = differenceFinder.findDifferenceBetweenHighestAndLowest(input);

        assertEquals(expected, result);
    }

}