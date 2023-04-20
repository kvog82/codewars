package org.example.stringIncrementer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class StringIncrementerTest {

    StringIncrementer stringIncrementer = new StringIncrementer();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("1", "2"),
                Arguments.of("009", "010"),
                Arguments.of("foo", "foo1"),
                Arguments.of("d", "d1"),
                Arguments.of("foo0", "foo1"),
                Arguments.of("foobar23", "foobar24"),
                Arguments.of("foo0042", "foo0043"),
                Arguments.of("foo4", "foo5"),
                Arguments.of("foo9", "foo10"),
                Arguments.of("foo099", "foo100"),
                Arguments.of("foo999", "foo1000"),
                Arguments.of("foobar000", "foobar001"),
                Arguments.of("99obar99", "99obar100")

        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void stringIncrementerReturnsIncrementedString(String input, String expected) {
        String result = stringIncrementer.incrementString(input);

        Assertions.assertEquals(expected, result);
    }

}