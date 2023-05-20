package org.example.whoLikesIt;

// Who likes it: https://www.codewars.com/kata/5266876b8f4bf2da9b000362

public class LikeInfo {
    public String generateText(String... names) {
        return switch (names.length) {
            case 0 -> "no one likes this";
            case 1 -> names[0] + " likes this";
            case 2 -> names[0] + " and " + names[1] + " like this";
            case 3 -> names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default -> names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        };
    }
}
