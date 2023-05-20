package org.example.digitalRoot;

import java.util.Arrays;
import java.util.List;

// Digital Root: https://www.codewars.com/kata/541c8630095125aba6000c00

public class DigitalRootBuilder {
    public int buildDigitalRoot(int n) {
        while (n >= 10) {
            List<String> digits = Arrays.asList(String.valueOf(n).split(""));
            n = digits.stream()
                    .mapToInt(Integer::parseInt)
                    .sum();
        }
        return n;
    }
}
