package org.example.buildTower;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TowerBuilderTest {

    TowerBuilder towerBuilder = new TowerBuilder();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new String[]{
                                "  *  ",
                                " *** ",
                                "*****"}, 3),
                Arguments.of(new String[]{
                            "     *     ",
                            "    ***    ",
                            "   *****   ",
                            "  *******  ",
                            " ********* ",
                            "***********"}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void towerBuilderReturnsTower(String[] expected, int floors) {
        String[] actual = towerBuilder.buildTower(floors);

        assertArrayEquals(expected, actual);
    }
}