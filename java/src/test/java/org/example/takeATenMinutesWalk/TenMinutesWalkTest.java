package org.example.takeATenMinutesWalk;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TenMinutesWalkTest {

    TenMinutesWalk tenMinutesWalk = new TenMinutesWalk();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(true, new char[] {'n','s','n','s','n','s','n','s','n','s'}),
                Arguments.of(true, new char[] {'n','s','n','s','n','s','n','s','n','s'}),
                Arguments.of(true, new char[] {'e','w','e','w','n','s','n','s','e','w'}),
                Arguments.of(true, new char[] {'n','s','e','w','n','s','e','w','n','s'}),
                Arguments.of(false, new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}),
                Arguments.of(false, new char[] {'w'}),
                Arguments.of(false, new char[] {'n','n','n','s','n','s','n','s','n','s'}),
                Arguments.of(false, new char[] {'n'}),
                Arguments.of(false, new char[] {'n', 's'}),
                Arguments.of(false, new char[] {'n','s','n','s','n','s','n','s','n','s','n','s'}),
                Arguments.of(false, new char[] {'n','s','e','w','n','s','e','w','n','s','e','w','n','s','e','w'}),
                Arguments.of(false, new char[] {'n','s','n','s','n','s','n','s','n','n'}),
                Arguments.of(false, new char[] {'e','e','e','w','n','s','n','s','e','w'}),
                Arguments.of(false, new char[] {'n','e','n','e','n','e','n','e','n','e'}), //
                Arguments.of(false, new char[] {'n','w','n','w','n','w','n','w','n','w'}), //
                Arguments.of(false, new char[] {'s','e','s','e','s','e','s','e','s','e'}), //
                Arguments.of(false, new char[] {'s','w','s','w','s','w','s','w','s','w'}), //
                Arguments.of(false, new char[] {'n','s','e','w','n','s','e','w','n','s','e','w','n','s','e','w','n','s','e','w'})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void tenMinutesWalkTest(boolean expected, char[] generatedWalk) {
        boolean result = tenMinutesWalk.isValid(generatedWalk);

        assertEquals(expected, result);
    }

}