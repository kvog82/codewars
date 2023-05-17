package org.example.digitalRoot;

import java.util.Arrays;
import java.util.List;

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
