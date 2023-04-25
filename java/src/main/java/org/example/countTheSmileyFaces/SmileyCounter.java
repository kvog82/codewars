package org.example.countTheSmileyFaces;

import java.util.List;

public class SmileyCounter {
    private final List<Character> validEyes = List.of(':', ';');
    private final List<Character> validNose = List.of('-', '~');
    private final List<Character> validMouth = List.of(')', 'D');

    public int countSmileys(List<String> arr) {
        int smileyCount = 0;

        for (String smiley : arr) {
            if (smiley.length() == 2
                && validEyes.contains(smiley.charAt(0))
                && validMouth.contains(smiley.charAt(1))) {
                smileyCount += 1;
            }
            if (smiley.length() == 3
                    && validEyes.contains(smiley.charAt(0))
                    && validNose.contains(smiley.charAt(1))
                    && validMouth.contains(smiley.charAt(2))) {
                smileyCount += 1;
            }
        }
        return smileyCount;
    }
}
