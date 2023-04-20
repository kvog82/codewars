package org.example.mexicanWave;

import java.util.Arrays;

public class MexicanWave {

    public String[] wave(String str) {

        String[] result = new String[str.replaceAll("\\s+","").length()];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            String wavedWord = getWavedWord(str, i);
            if (wavedWord != null) {
                result[index] = wavedWord;
                index++;
            }
        }
        return result;
    }

    private static String getWavedWord(String str, int i) {
        String wavedWord = "";
        String begin = str.substring(0, i);

        char wavingCharacter = Character.toUpperCase(str.charAt(i));
        String end = str.substring(i +1);
        wavedWord = begin + wavingCharacter + end;
        if(str.charAt(i) == ' ') {
            wavedWord = null;
        }
        return wavedWord;
    }

}
