package org.example.bitCounting;

// Bit Counting: https://www.codewars.com/kata/526571aae218b8ee490006f4
public class BitCounter {
    public int countBits(int n){
        return (int) Integer.toBinaryString(n)
                .chars()
                .filter(c -> c == '1')
                .count();
    }
}
