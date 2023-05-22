package org.example.takeATenMinutesWalk;

import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

// Take a Ten Minutes Walk: https://www.codewars.com/kata/54da539698b8a2ad76000228

public class TenMinutesWalk {
    public boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        Map<Character, Long> directionsCount = new String(walk)
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        boolean isValid = !(directionsCount.containsKey('n') && !directionsCount.containsKey('s')
                || !directionsCount.containsKey('n') && directionsCount.containsKey('s'))
                && !(directionsCount.containsKey('n') && directionsCount.containsKey('s')
                && directionsCount.get('n') != directionsCount.get('s'))
                && !(directionsCount.containsKey('e') && !directionsCount.containsKey('w')
                || !directionsCount.containsKey('e') && directionsCount.containsKey('w'))
                && !(directionsCount.containsKey('e') && directionsCount.containsKey('w')
                && !Objects.equals(directionsCount.get('e'), directionsCount.get('w')));

        return isValid;
    }
}
