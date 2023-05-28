package org.example.splitStrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringSplitterTest {

    StringSplitter stringSplitter = new StringSplitter();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new String[]{"ab", "c_"}, "abc"),
                Arguments.of(new String[]{"ab", "cd", "ef"}, "abcdef"),
                Arguments.of(new String[]{"He", "ll", "oW", "or", "ld"}, "HelloWorld"),
                Arguments.of(new String[]{"ab", "cd", "e_"}, "abcde"),
                Arguments.of(new String[]{"Lo", "ve", "Pi", "zz", "a_"}, "LovePizza")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void stringSplitterTest(String[] expected, String input) {
        String[] result = stringSplitter.split(input);

        assertArrayEquals(expected, result);

    }

}