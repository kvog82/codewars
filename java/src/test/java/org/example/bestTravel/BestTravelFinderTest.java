package org.example.bestTravel;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BestTravelFinderTest {

    BestTravelFinder bestTravelFinder = new BestTravelFinder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(163, 163, 3, new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58))),
                Arguments.of(null, 163, 3, new ArrayList<>(Arrays.asList(50))),
                Arguments.of(228, 230, 3, new ArrayList<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87))),
                Arguments.of(null, 100, 3, new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58)))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void bestTravelFinderReturnsDistanceOrNull(Integer expected, int maxDistance, int numberOfCities, List<Integer> distances) {
        Integer result = bestTravelFinder.chooseBestSum(maxDistance, numberOfCities, distances);

        assertEquals(expected, result);
    }

}