package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int sizeMass) {
        int[][] tmpMass = new int[sizeMass][sizeMass];
        for (int row = 0; row < tmpMass.length; row++) {
            for (int col = 0; col < tmpMass[row].length; col++) {
                tmpMass[row][col] = (row + 1) * (col + 1);
            }
        }
        return tmpMass;
    }
}

