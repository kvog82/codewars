package org.example.anagramDetection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    AnagramDetector anagramDetector = new AnagramDetector();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(true, "foefet", "toffee"),
                Arguments.of(true, "Buckethead", "DeathCubeK"),
                Arguments.of(true, "Twoo", "Woot"),
                Arguments.of(false, "apple", "pale")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void anagramDetectorFindsAnagram(boolean expected, String test, String original) {
        boolean result = anagramDetector.isAnagram(test, original);

        assertEquals(expected, result);
    }
}