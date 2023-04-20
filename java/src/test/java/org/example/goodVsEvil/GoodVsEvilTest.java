package org.example.goodVsEvil;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GoodVsEvilTest {

    GoodVsEvil goodVsEvil = new GoodVsEvil();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("Battle Result: Evil eradicates all trace of Good", "1 1 1 1 1 1", "1 1 1 1 1 1 1"),
                Arguments.of("Battle Result: Good triumphs over Evil", "0 0 0 0 0 10", "0 1 1 1 1 0 0"),
                Arguments.of("Battle Result: No victor on this battle field", "1 0 0 0 0 0", "1 0 0 0 0 0 0")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testBattle(String expected, String goodAmounts, String evilAmounts) {
        String result = goodVsEvil.battle(goodAmounts, evilAmounts);
        assertEquals(expected, result);
    }
}