package org.example.persistentBugger;

import java.util.stream.LongStream;

// Persistent Bugger: https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec

public class DigitsMultiplier {
    public int persist(long n) {
        int timesMultiplied = 0;
        long result = n;
        while (result > 9) {
            result = LongStream.of(result)
                    .mapToObj(String::valueOf)
                    .flatMapToInt(CharSequence::chars)
                    .map(Character::getNumericValue)
                    .asLongStream()
                    .reduce(1, (a, b) -> a * b);
            timesMultiplied += 1;
        }
        return timesMultiplied;
    }
}
