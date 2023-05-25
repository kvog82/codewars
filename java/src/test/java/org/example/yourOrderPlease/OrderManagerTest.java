package org.example.yourOrderPlease;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OrderManagerTest {

    OrderManager orderManager = new OrderManager();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of("Thi1s is2 3a T4est", "is2 Thi1s T4est 3a"),
                Arguments.of("Fo1r the2 g3ood 4of th5e pe6ople", "4of Fo1r pe6ople g3ood th5e the2")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void orderReturnsOrderedString(String expected, String words) {
        String actual = orderManager.order(words);

        assertEquals(expected, actual);
    }

}