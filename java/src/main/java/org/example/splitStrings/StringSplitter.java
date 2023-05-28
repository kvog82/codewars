package org.example.splitStrings;

//Split Strings: https://www.codewars.com/kata/515de9ae9dcfc28eb6000001

public class StringSplitter {
    public String[] split(String s) {
        int stringLength = s.length();
        int arrayLength = stringLength/2;
        if (stringLength % 2 != 0) {
            arrayLength += 1;
        }
        String[] result = new String[arrayLength];
        int i = 0;
        while (i < result.length) {
            if (s.length() == 0) {
                break;
            }
            if (s.length() == 1) {
                result[i] = s.substring(0, 1) + "_";
                break;
            }
            result[i] = s.substring(0, 2);
            s = s.substring(2);
            i++;
        }
        return result;
    }
}
