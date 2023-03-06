package org.example.descendingOrder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DescendingOrderTest {

    DescendingOrder descendingOrder = new DescendingOrder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(10, 10),
                Arguments.of(11, 11),
                Arguments.of(51, 15),
                Arguments.of(51, -15),
                Arguments.of(321, 321),
                Arguments.of(987654321, 123456789)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void sortsDescending(int expected, int number) {
        int actual = descendingOrder.sortDesc(number);

        assertEquals(expected, actual);
    }

}