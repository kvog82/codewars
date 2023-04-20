package org.example.stringIncrementer;

import java.util.Arrays;

public class StringIncrementer {

    public String incrementString(String str) {
        String[] part = str.split("(?<=\\D)(?=\\d)");
        String stringPart= "";
        String numberPart= "";
        if (part.length == 1) {
            if (part[0].matches("-?\\d+(\\.\\d+)?")) {
                numberPart = String.valueOf(Integer.parseInt(part[0]));
            } else {
                return str + 1;
            }
        } else {
            stringPart = part[0];
            numberPart = part[1];
        }
        System.out.println("part = " + part);
//        for (int i = 0; i < numberPart.length()-1; i++) {
//            if(Character.isDigit(str.charAt(i))) {
//                stringPart = str.substring(0, i);
//                numberPart = str.substring(i);
//                break;
//            }
//        }

        String leadingZeros = "";
        String numberToIncrement = numberPart;
        String incrementedNumber = "";

        for (int i = 0; i < numberPart.length(); i++) {
            if(Integer.parseInt(String.valueOf(numberPart.charAt(i))) > 0) {
                leadingZeros = numberPart.substring(0, i);
                numberToIncrement = numberPart.substring(i);
                break;
            }
        }
        System.out.println("numberPart = " + numberPart);
        boolean numberToIncrementHasOnlyZeroes = true;
        if (Integer.parseInt(numberPart) > 0) {
            numberToIncrementHasOnlyZeroes = false;
        }

        if(numberToIncrementHasOnlyZeroes) {
            leadingZeros = numberToIncrement.substring(0, numberToIncrement.length()-1);
        }

        incrementedNumber = String.valueOf(Integer.parseInt(numberToIncrement) +1);
        if(incrementedNumber.length() > numberToIncrement.length()) {
            if(leadingZeros.length() <= 1) {
                leadingZeros = "";
            }
            if(leadingZeros.length() > 1) {
                leadingZeros = leadingZeros.substring(0, leadingZeros.length()-1);
            }
        }

        return stringPart + leadingZeros + incrementedNumber;
    }
}
