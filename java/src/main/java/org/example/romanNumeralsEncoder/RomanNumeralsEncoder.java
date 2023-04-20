package org.example.romanNumeralsEncoder;

import java.util.Map;

public class RomanNumeralsEncoder {
    private final int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private final String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public String encode(int n) {
        StringBuilder roman = new StringBuilder();
        for(int i=0;i<values.length;i++)
        {
            while(n >= values[i])
            {
                n = n - values[i];
                roman.append(romanLetters[i]);
            }
        }
        return roman.toString();
    }
}
