package org.example.directionsReducer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DirReductionTest {
    DirReduction dirReduction = new DirReduction();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new String[]{}, new String[]{}),
                Arguments.of(new String[]{"WEST"}, new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}),
                Arguments.of(new String[]{"WEST", "WEST"}, new String[]{"NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"}),
                Arguments.of(new String[]{}, new String[]{"NORTH", "SOUTH", "EAST", "WEST"}),
                Arguments.of(new String[]{}, new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void reducerReturnsNewList(String[] expected, String[] directions) {
        String[] result = dirReduction.dirReduc(directions);

        assertArrayEquals(expected, result);
    }

}