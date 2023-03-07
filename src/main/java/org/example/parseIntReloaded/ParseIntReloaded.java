package org.example.parseIntReloaded;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParseIntReloaded {
    public int parseInt(String numStr) {
        List<String> wordsList = getWordsListWithoutAnds(numStr);
        return transformWordsToInteger(wordsList);
    }

    private static List<String> getWordsListWithoutAnds(String numStr) {
        List<String> wordsList = new ArrayList<>(List.of(numStr.split(" ")));

        for (Iterator<String> iterator = wordsList.iterator(); iterator.hasNext();) {
            String word = iterator.next();
            if(word.equals("and")) {
                iterator.remove();
            }
        }
        return wordsList;
    }

    private static int transformWordsToInteger(List<String> wordsList) {
        int result = 0;
        for (String word : wordsList) {
            if(word.equals("hundred") && wordsList.indexOf(word) == 0) {
                result = 100;
            }
            else if(word.equals("hundred")) {
                result = result*100;
            }
            else if(word.equals("thousand") && wordsList.indexOf(word) == 0) {
                result = 1000;
            }
            else if(word.equals("thousand")) {
                result = result*1000;
                if(wordsList.indexOf(word) < wordsList.size()-2) {
                    result = result / 100;
                }
            }
            else if(word.equals("million")) {
                result = result*1000000;
                if(wordsList.indexOf(word) < wordsList.size()-2) {
                    result = result / 100000;
                }
            }
            else if(word.contains("-")) {
                List<String> digitsList = new ArrayList<>(List.of(word.split("-")));
                int numberOne = NumericValues.valueOf(digitsList.get(0).toUpperCase()).getNumericValue();
                int numberTwo = NumericValues.valueOf(digitsList.get(1).toUpperCase()).getNumericValue();
                int number = numberOne + numberTwo;
                result +=number;
            } else {
                result += NumericValues.valueOf(word.toUpperCase()).getNumericValue();
            }
        }
        return result;
    }
}