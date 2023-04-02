package org.example.nextBiggerNumber;


import java.util.Arrays;


public class NextBiggerNumber {
    public long nextBiggerNumber(long n) {
        char[] numberArray = Long.toString(n).toCharArray();
        int i = findPivot(numberArray);

        if (i == 0) {
            return -1;
        }
        else {
            int min = getSubstituteFromRight(numberArray, i);
            swap(numberArray, i - 1, min);
            Arrays.sort(numberArray, i, numberArray.length);
        }
        return Long.parseLong(String.valueOf(numberArray));
    }

    private static int getSubstituteFromRight(char[] numberArray, int i) {
        int x = numberArray[i - 1], min = i;
        for (int j = i + 1; j < numberArray.length; j++) {
            if (numberArray[j] > x && numberArray[j] < numberArray[min]) {
                min = j;
            }
        }
        return min;
    }

    private static int findPivot(char[] numberArray) {
        int i;
        for (i = numberArray.length - 1; i > 0; i--) {
            if (numberArray[i] > numberArray[i - 1]) {
                break;
            }
        }
        return i;
    }

    static void swap(char ar[], int i, int j) {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
