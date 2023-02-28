package org.example.directionsReducer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirReductionTest {
    DirReduction dirReduction = new DirReduction();

    @Test
    public void reducerReturnsNewList() {
        String[] directions = new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        String[] expected = new String[]{"WEST"};

        String[] result = DirReduction.dirReduc(directions);

        assertArrayEquals(expected, result);
    }

}