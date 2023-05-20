package org.example.weightForWeight;

import java.util.Comparator;
import java.util.List;

// Weight for weight: https://www.codewars.com/kata/55c6126177c9441a570000cc

public class WeightSorter {
    public String orderWeights(String weights) {
        List<String> weightsList = List.of(weights.split("\\s"));

        List<String> orderedWeightsList = weightsList.stream()
                .sorted(Comparator.comparingInt(this::getSum)
                        .thenComparing(Comparator.naturalOrder()))
                .toList();

        return String.join(" ", orderedWeightsList);
    }

    private int getSum(String number) {
        int sum = 0;
        for (char c : number.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }
}
