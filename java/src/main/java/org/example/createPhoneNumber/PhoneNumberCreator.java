package org.example.createPhoneNumber;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PhoneNumberCreator {
    public String createPhoneNumber(int[] numbers) {
        String prefix = IntStream.of(numbers)
                .limit(3)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        String numberPartOne = IntStream.of(numbers)
                        .skip(3)
                        .limit(3)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining());

        String numberPartTwo = IntStream.of(numbers)
                .skip(6)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        return "(" + prefix + ") " + numberPartOne + "-" + numberPartTwo;
    }
}
