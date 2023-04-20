package org.example.goodVsEvil;

import java.util.List;

public class GoodVsEvil {
    private final List<Integer> good = List.of(1, 2, 3, 3, 4, 10);
    private final List<Integer> evil = List.of(1, 2, 2, 2, 3, 5, 10);

    public String battle(String goodAmounts, String evilAmounts) {
        int goodWorth = getWorth(goodAmounts);
        int evilWorth = getWorth(evilAmounts);
        return getResult(goodWorth, evilWorth);
    }

    private String getResult(int goodWorth, int evilWorth) {
        if (goodWorth > evilWorth) {
            return "Battle Result: Good triumphs over Evil";
        }
        if (goodWorth < evilWorth) {
            return "Battle Result: Evil eradicates all trace of Good";
        }
        return "Battle Result: No victor on this battle field";
    }

    private int getWorth(String amounts) {
        int worth = 0;
        String[] amountsSplit = amounts.split(" ");
        List<Integer> racesWorths = good;
        if (amountsSplit.length == 7) {
            racesWorths = evil;
        }

        for (int i = 0; i < amountsSplit.length; i++) {
            worth += Integer.parseInt(amountsSplit[i]) * racesWorths.get(i);

        }
        return worth;
    }
}
