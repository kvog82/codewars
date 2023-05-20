package org.example.descendingOrder;

import java.util.ArrayList;
import java.util.Collections;

// Descending Order: https://www.codewars.com/kata/5467e4d82edf8bbf40000155

public class DescendingOrder {

    public int sortDesc(int num) {
        num = convertToPositive(num);
        return getSortedNumber(num);
    }

    private static int getSortedNumber(int num) {
        String numberString = Integer.toString(num);
        ArrayList<String> numberList = new ArrayList<>();
        for (int i = 0; i < numberString.length(); i++) {
            numberList.add(String.valueOf(numberString.charAt(i)));
        }
        numberList.sort(Collections.reverseOrder());
        return Integer.parseInt(String.join("", numberList));
    }

    private static int convertToPositive(int num) {
        if (num < 0 ) {
            num *= -1;
        }
        return num;
    }
}
