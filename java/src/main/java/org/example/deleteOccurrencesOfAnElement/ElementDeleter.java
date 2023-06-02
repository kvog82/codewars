package org.example.deleteOccurrencesOfAnElement;

import java.util.ArrayList;
import java.util.List;

// Delete occurrences of an element if it occurs more than n times: https://www.codewars.com/kata/554ca54ffa7d91b236000023
public class ElementDeleter {
    public int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> picturesToShow = new ArrayList<>();
        for (int element : elements) {
            int elementCount = 0;
            for (Integer integer : picturesToShow) {
                if (integer == element) {
                    elementCount++;
                }
            }
            if (elementCount < maxOccurrences) {
                picturesToShow.add(element);
            }
        }
        int[] result = new int[picturesToShow.size()];
        for (int i = 0; i < picturesToShow.size(); i++) {
            result[i] = picturesToShow.get(i);
        }
        return result;
    }
}
