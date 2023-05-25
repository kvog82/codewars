package org.example.yourOrderPlease;

import java.util.*;

// Your order, please: https://www.codewars.com/kata/55c45be3b2079eccff00010f
public class OrderManager {
    public String order(String words) {
        if (words == "") {
            return "";
        }
        List<String> wordsList = new ArrayList<> (Arrays.asList(words.split("\\s")));
        List<String> resultList = new ArrayList<>();
        int number = 1;
        while (!wordsList.isEmpty()) {
            Iterator<String> iterator = wordsList.iterator();
            while (iterator.hasNext()) {
                String s = iterator.next();
                if (s.contains(String.valueOf(number))) {
                    resultList.add(s);
                    iterator.remove();
                }
            }
            number++;
        }
        return String.join(" ", resultList);
    }
}
