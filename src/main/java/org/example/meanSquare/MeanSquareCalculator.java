package org.example.meanSquare;

public class MeanSquareCalculator {
    public double calculate(int[] arr1, int[] arr2) {
        double sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            int difference = arr1[i] - arr2[i];
            if (difference < 0) {
                difference = difference * -1;
            }
            sum += Math.pow(difference, 2);
        }
        return sum/arr1.length;
    }
}
