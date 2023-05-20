package org.example.tribonacciSequence;

// Tribonacci Sequence: https://www.codewars.com/kata/556deca17c58da83c00002db

public class TribonacciSequence {

    public double[] buildTribonacciSequence(double[] s, int n) {
        double[] result = new double[n];

        if (n < 3) {
            return buildSequenceWithLengthOneOrTwo(s, n, result);
        }

        buildSequenceLongerThanTwo(s, n, result);

        return result;
    }

    private static double[] buildSequenceWithLengthOneOrTwo(double[] s, int n, double[] result) {
        for (int i = 0; i < n; i++) {
            result[i] = s[i];
        }
        return result;
    }

    private static void buildSequenceLongerThanTwo(double[] s, int n, double[] result) {
        for (int i = 0; i < 3; i++) {
            result[i] = s[i];
        }

        for (int i = 3; i < n; i++) {
            result[i] = result[i-3] + result[i-2] + result[i-1];
        }
    }

}
