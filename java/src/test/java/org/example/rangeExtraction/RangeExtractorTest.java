package org.example.rangeExtraction;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RangeExtractorTest {
    RangeExtractor rangeExtractor = new RangeExtractor();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("-10--8,-6,-3-1,3-5,7-11,14,15,17-20", new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}),
                Arguments.of("-6,-3-1,3-5,7-11,14,15,17-20", new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}),
                Arguments.of("-3--1,2,10,15,16,18-20", new int[] {-3,-2,-1,2,10,15,16,18,19,20})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void rangeExtractorReturnsRangeString(String expected, int[] input) {
        String result = rangeExtractor.buildRangeString(input);

        assertEquals(expected, result);
    }
}