package org.example.createPhoneNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberCreatorTest {

    PhoneNumberCreator phoneNumberCreator = new PhoneNumberCreator();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("(123) 456-7890", new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void phoneNumberCreatorReturnsNumberString(String expected, int[] inputInts) {
        String result = phoneNumberCreator.createPhoneNumber(inputInts);

        assertEquals(expected, result);
    }
}