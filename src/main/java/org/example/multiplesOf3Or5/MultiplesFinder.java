package org.example.multiplesOf3Or5;

public class MultiplesFinder {
    public int find(int number) {
        if (number <= 0) {
            return 0;
        }
        return getSum(number);
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
}
