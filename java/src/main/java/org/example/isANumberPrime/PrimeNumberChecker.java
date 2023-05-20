package org.example.isANumberPrime;

public class PrimeNumberChecker {

// Is a number prime? https://www.codewars.com/kata/5262119038c0985a5b00029f

    public boolean isPrime(int num) {
        if(num == 2) {
            return true;
        }
        if(num < 2 || num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
