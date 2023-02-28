package org.example;

import org.example.directionsReducer.DirReduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));
        // WEST
        System.out.println(Arrays.toString(DirReduction.dirReduc(new String[]{"NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"})));
        // WEST, WEST
        System.out.println(Arrays.toString(DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "EAST", "WEST"})));
        // []
        System.out.println(Arrays.toString(DirReduction.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"})));
        // []
    }
}