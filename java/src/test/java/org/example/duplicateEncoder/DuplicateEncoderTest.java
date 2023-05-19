package org.example.duplicateEncoder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEncoderTest {

    DuplicateEncoder duplicateEncoder = new DuplicateEncoder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(")()())()(()()(", "Prespecialized"),
                Arguments.of("))))())))", "   ()(   "),
                Arguments.of("(((", "din"),
                Arguments.of("()()()", "recede"),
                Arguments.of(")())())", "Success"),
                Arguments.of("))((", "(( @")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void duplicateEncoderTest(String expected, String input) {
        String actual = duplicateEncoder.encode(input);

        assertEquals(expected, actual);
    }

}