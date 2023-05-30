package org.example.rgbToHexConversion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RGBConverterTest {

    RGBConverter rgbConverter = new RGBConverter();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("000000", 0, 0, 0),
                Arguments.of("010203", 1, 2, 3),
                Arguments.of("FFFFFF", 255, 255, 255),
                Arguments.of("FEFDFC", 254, 253, 252),
                Arguments.of("00FF7D", -20, 275, 125)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void rgbConverterTest(String expected, int r, int g, int b) {
        String result = rgbConverter.convert(r, g, b);

        assertEquals(expected, result);
    }
}