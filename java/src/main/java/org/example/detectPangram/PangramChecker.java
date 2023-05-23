package org.example.detectPangram;

// Detect Pangram: https://www.codewars.com/kata/545cedaa9943f7fe7b000048

public class PangramChecker {
    public boolean check(String sentence){
        boolean isPangram = true;
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                                    'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (char c : alphabet) {
            if (!sentence.toLowerCase().contains(String.valueOf(c))) {
                isPangram = false;
                break;
            }
        }
        return isPangram;
    }
}
