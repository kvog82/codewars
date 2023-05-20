package org.example.directionsReducer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Directions Reduction: https://www.codewars.com/kata/550f22f4d758534c1100025a

public class DirReduction {
    public String[] dirReduc(String[] arr) {
        List<String> reducedList = getReducedList(arr);
        return reducedList.toArray(new String[0]);
    }

    private List<String> getReducedList(String[] arr) {
        List<String> listToReduce = new ArrayList<>(Arrays.asList(arr));
        boolean continueReducing = true;

        while (continueReducing) {
            int sizeBefore = listToReduce.size();
            for (int i = 0; i < listToReduce.size(); i++) {
                int j = i + 1;
                if (j < listToReduce.size()) {
                    if (areOpposites(listToReduce.get(i), listToReduce.get(j))) {
                        listToReduce.remove(j);
                        listToReduce.remove(i);
                    }
                }
            }
            int sizeAfter = listToReduce.size();
            if (sizeBefore == sizeAfter) {
                continueReducing = false;
            }
        }
        return listToReduce;
    }

    private boolean areOpposites(String dir1, String dir2) {
        if (dir1.equals("NORTH") && dir2.equals("SOUTH")
                || dir1.equals("EAST") && dir2.equals("WEST")
                || dir1.equals("SOUTH") && dir2.equals("NORTH")
                || dir1.equals("WEST") && dir2.equals("EAST")) {
            return true;
        }
        return false;
    }
}
