package org.example.scramblies;

import java.util.HashMap;
import java.util.Map;

public class CharacterChecker {
    public boolean checkScramble(String str1, String str2) {
        Map<Character, Integer> str1CharacterCount = getCharacterMap(str1);
        Map<Character, Integer> str2CharacterCount = getCharacterMap(str2);
        return checkIfScrambleIsPossible(str1CharacterCount, str2CharacterCount);

    }

    private Map<Character, Integer> getCharacterMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    private boolean checkIfScrambleIsPossible(Map<Character, Integer> str1Characters, Map<Character, Integer> str2Characters) {
        boolean result = true;
        for (Map.Entry<Character, Integer> characterEntry : str2Characters.entrySet()) {
            if (!str1Characters.containsKey(characterEntry.getKey())
                    || (str1Characters.containsKey(characterEntry.getKey())
                    && str1Characters.get(characterEntry.getKey()) < characterEntry.getValue())) {
                result = false;
                break;
            }
        }
        return result;
    }
}
