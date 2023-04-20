package org.example.findTheUniqueNumber;

import java.util.HashMap;
import java.util.Map;


public class UniqueNumberFinder {
    public double findUniqueNumber(double[] arr) {
        Map<Double, Integer> numbers = getDoubleCountingMap(arr);
        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return 0.0;
    }

    private static Map<Double, Integer> getDoubleCountingMap(double[] arr) {
        Map<Double, Integer> numbers = new HashMap<>();
        for (double number : arr) {
            if(numbers.containsKey(number)) {
                numbers.put(number, numbers.get(number)+1);
            } else {
                numbers.put(number, 1);
            }
        }
        return numbers;
    }
}
