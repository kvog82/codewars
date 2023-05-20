package org.example.numbersExpandedForm;

// Write Number in Expanded Form: https://www.codewars.com/kata/5842df8ccbd22792a4000245

public class NumberExpander {
    public String expandedForm(int num) {
        String numString = String.valueOf(num);
        String result = getResultString(numString);
        return result;
    }

    private String getResultString(String numString) {
        String result = "";

        for (int i = 0; i < numString.length(); i++) {
            int number = Character.getNumericValue(numString.charAt(i));
            if (number > 0) {
                int multiplicator = (int) Math.pow(10, numString.length()-1-i);
                int resultNumber = number*multiplicator;
                    result += " + " + resultNumber;
            }
        }
        if (result != "") {
            result = result.substring(3);
        }
        return result;
    }
}
