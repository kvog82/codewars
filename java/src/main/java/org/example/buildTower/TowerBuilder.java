package org.example.buildTower;

public class TowerBuilder {
    public String[] buildTower(int floors) {
        String[] tower = new String[floors];
        int floorLength = floors * 2 - 1;

        buildTower(floors, tower, floorLength);
        return tower;
    }

    private static void buildTower(int floors, String[] tower, int floorLength) {
        int numberOfStars = floorLength;
        for (int i = floors; i > 0; i--) {
            StringBuilder floor = new StringBuilder();
            String halfOfEmptySpaces = " ".repeat(Math.max(0, (floorLength - numberOfStars) / 2));
            floor.append(halfOfEmptySpaces);
            floor.append("*".repeat(Math.max(0, numberOfStars)));
            floor.append(halfOfEmptySpaces);
            tower[i-1] = String.valueOf(floor);
            numberOfStars -= 2;
        }
    }
}
