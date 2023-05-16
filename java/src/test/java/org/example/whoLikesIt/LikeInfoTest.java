package org.example.whoLikesIt;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import javax.swing.text.LayoutQueue;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LikeInfoTest {
    LikeInfo likeInfo = new LikeInfo();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("no one likes this", new String[0]),
                Arguments.of("Peter likes this", new String[]{"Peter"}),
                Arguments.of("Jacob and Alex like this", new String[]{"Jacob", "Alex"}),
                Arguments.of("Max, John and Mark like this", new String[]{"Max", "John", "Mark"}),
                Arguments.of("Alex, Jacob and 2 others like this", new String[]{"Alex", "Jacob", "Mark", "Max"})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void generateTextReturnsLikeString(String expected, String... names) {
        String likeString = likeInfo.generateText(names);

        assertEquals(expected, likeString);
    }
}