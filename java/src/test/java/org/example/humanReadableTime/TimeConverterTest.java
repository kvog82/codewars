package org.example.humanReadableTime;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TimeConverterTest {

    TimeConverter timeConverter = new TimeConverter();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("00:00:00", 0),
                Arguments.of("00:00:05", 5),
                Arguments.of("00:01:00", 60),
                Arguments.of("23:59:59", 86399),
                Arguments.of("99:59:59", 359999)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void timeConverterTest(String expected, int seconds) {
        String result = timeConverter.makeReadable(seconds);

        assertEquals(expected, result);
    }
}