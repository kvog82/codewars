package org.example.nextBiggerNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.sort;

public class NextBiggerNumber {
    public long nextBiggerNumber(long n) {

        String numberString = Long.toString(n);
        int length = numberString.length();
        List<Long> numbers = new ArrayList<>();

        if (length == 1) {
            return -1;
        }

        if (length == 2) {
//            System.out.println("numberString = " + numberString);
            String newNumber = "";
            newNumber += numberString.charAt(1);
            newNumber += numberString.charAt(0);
            numbers.add(Long.parseLong(newNumber));
        }

        else {
            int count = length * 2;
            while (count > 0) {
                for (int i = 1; i < length; i++) {

                    String begin = numberString.substring(0, i);
                    char rotatingChar = numberString.charAt(i);
                    String end = numberString.substring(i + 1);
//                    System.out.println("begin = " + begin);
//                    System.out.println("end = " + end);
//                    System.out.println("rotatingChar = " + rotatingChar);

                    String rotatedString = begin + end + rotatingChar;
//                    System.out.println("rotatedString = " + rotatedString);
                    long rotatedNumber = Long.parseLong(rotatedString);
                    if (!numbers.contains(rotatedNumber)) {
                        numbers.add(Long.parseLong(rotatedString));
                    }

                    numberString = rotatedString;
                }
                count--;
            }
        }
        sort(numbers);
        System.out.println("numbers = " + numbers);
        if(numbers.size() == 1) {
            return numbers.get(0);
        }
        int indexOfN = numbers.indexOf(n);
        if (indexOfN == numbers.size()-1) {
            return -1;
        }

        return numbers.get(numbers.indexOf(n)+1);
    }

    public long nextBiggerNumberFromCodewars(long n) {
        String str = String.valueOf(n);

        int i = str.length()-2;
        while((i >= 0) && (str.charAt(i) >= str.charAt(i+1))) {
            i--;
        }

        if(i < 0) {
            return -1;
        }

        int j = str.length()-1;
        while(str.charAt(j) <= str.charAt(i)) {
            j--;
        }

        char[] arr = str.toCharArray();
        char tempStore = arr[i];
        arr[i] = arr[j];
        arr[j] = tempStore;

        Arrays.sort(arr, i+1, arr.length);

        return Long.parseLong(new String(arr));
    }
}
