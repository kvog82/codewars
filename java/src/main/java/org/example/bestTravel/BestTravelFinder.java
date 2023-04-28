package org.example.bestTravel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BestTravelFinder {
    public Integer chooseBestSum(int maxDistance, int numberOfCities, List<Integer> distances) {
        List<Integer> combinationSums = getCombinationSums(numberOfCities, distances);
        if (combinationSums.isEmpty()) {
            return null;
        } else {
            return combinationSums.stream()
                    .filter(sum -> sum <= maxDistance)
                    .max(Integer::compare)
                    .orElse(null);
        }
    }

    private static List<Integer> getCombinationSums(int numberOfCities, List<Integer> distances) {
        return IntStream.range(0, 1 << distances.size())
                .filter(i -> Integer.bitCount(i) == numberOfCities)
                .map(i -> IntStream.range(0, distances.size())
                        .filter(j -> (i & (1 << j)) != 0)
                        .map(distances::get)
                        .sum())
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
}
