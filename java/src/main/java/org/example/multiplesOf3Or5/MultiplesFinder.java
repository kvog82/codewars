package org.example.multiplesOf3Or5;

import java.util.stream.IntStream;

public class MultiplesFinder {
    public int find(int number) {
        return number < 0 ? 0 : getSum(number);
    }

    private static int getSum(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int findWithStream(int number) {
        return number < 0 ? 0 : getSumStream(number);
    }

    private  int getSumStream(int number) {
        return IntStream.range(0,number)
                .filter(num -> num % 3 == 0 || num % 5 == 0)
                .sum();
    }
}
