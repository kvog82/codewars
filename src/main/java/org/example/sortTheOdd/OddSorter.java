package org.example.sortTheOdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OddSorter {
    public int[] sortArray(int[] array) {
        List<Integer> sorted = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odds.add(array[i]);
            }
        }
        Collections.sort(odds);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sorted.add(odds.get(0));
                odds.remove(0);
            } else {
                sorted.add(array[i]);
            }
        }

        return sorted.stream().mapToInt(i -> i).toArray();
    }
}
