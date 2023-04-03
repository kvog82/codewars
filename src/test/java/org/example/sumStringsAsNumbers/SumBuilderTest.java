package org.example.sumStringsAsNumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SumBuilderTest {

    SumBuilder sumBuilder = new SumBuilder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("", "", "0"),
                Arguments.of("1", "2", "3"),
                Arguments.of("10", "5", "15"),
                Arguments.of("123", "456", "579"),
                Arguments.of("123456789", "123456789", "246913578"),
                Arguments.of("36545606153", "214805821884803623812111146", "214805821884803660357717299"),
                Arguments.of("712569312664357328695151392", "8100824045303269669937", "712577413488402631964821329"),
                Arguments.of("000007125774134883102631964821329", "000007125774134883102631964821329", "14251548269766205263929642658")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void sumStringReturnsStringOfSumValue(String inputOne, String inputTwo, String expected) {
        String result = sumBuilder.sumStrings(inputOne, inputTwo);

        Assertions.assertEquals(expected, result);
    }

}