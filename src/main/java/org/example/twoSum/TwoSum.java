package org.example.twoSum;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i != j && numbers[i] + numbers[j] == target) {
                    indices.add(i);
                    indices.add(j);
                }
            }
        }
        return new int[]{indices.get(0), indices.get(1)};
    }
}
