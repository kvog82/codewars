package org.example.findParityOutlier;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindParityOutlierTest {

    FindParityOutlier nextPartyOutlier = new FindParityOutlier();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(3, new int[]{2,6,8,-10,3}),
                Arguments.of(206847684, new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void blabla(int expected, int[] input) {
        int result = nextPartyOutlier.find(input);

        assertEquals(expected, result);
    }

}