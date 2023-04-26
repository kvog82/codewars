package org.example.rangeExtraction;

import java.util.ArrayList;
import java.util.List;


public class RangeExtractor {
    public String buildRangeString(int[] arr) {
        StringBuilder result = new StringBuilder();
        addNumbersOrRangesToResultString(arr, result);
        return result.substring(0, result.length()-1);
    }

    private static void addNumbersOrRangesToResultString(int[] arr, StringBuilder result) {
        List<Integer> range = new ArrayList<>();
        range.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (range.isEmpty()) {
                range.add(arr[i]);
            } else if (arr[i-1] + 1 == arr[i]) {
                range.add(arr[i]);
            } else {
                appendRange(result, range);
                range.clear();
                range.add(arr[i]);
            }
        }
        appendRange(result, range);
    }

    private static void appendRange(StringBuilder result, List<Integer> range) {
        if (range.size() == 1){
            result.append(range.get(0)).append(",");
        }
        if (range.size() == 2){
            result.append(range.get(0)).append(",").append(range.get(1)).append(",");
        }
        if (range.size() > 2) {
            result.append(range.get(0)).append("-").append(range.get(range.size() - 1)).append(",");
        }
    }
}
