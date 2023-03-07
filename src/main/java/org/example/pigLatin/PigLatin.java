package org.example.pigLatin;

import java.util.List;

public class PigLatin {
    public String pigIt(String str) {
        List<String> wordsList = List.of(str.split(" "));
        List<String> punctuationMarks = List.of(".", ",", "!", "?", ":", ";");
        String pigLatinSentence = "";
        System.out.println("wordsList = " + wordsList);
        for (String s : wordsList) {
            if (s.length() > 1 || !punctuationMarks.contains(s) ) {
                pigLatinSentence += s.substring(1) + s.charAt(0) + "ay ";
            } else {
                pigLatinSentence += s + " ";
            }
        }
        return pigLatinSentence.trim();
    }
}
