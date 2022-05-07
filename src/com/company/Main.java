package com.company;

import java.util.ArrayList;

public class Main<T extends Comparable<T>> {
    private  ArrayList<T> vector;
    private int firstDimension;
    private int secondDimension;
    private int thirdDimension;


    public void MatrixFlatten(T[][][] matrix){
        firstDimension = matrix.length;
        secondDimension = matrix[0].length;
        thirdDimension = matrix[0][0].length;
        // initialize the vector and fill it
        vector = new ArrayList<>(this.firstDimension * this.secondDimension * this.thirdDimension);
        for (int i = 0; i < firstDimension; i++) {
            for (int j = 0; j < secondDimension; j++) {
                for (int k = 0; k < thirdDimension; k++) {
                    vector.add(matrix[i][j][k]);
                }
            }
        }
    }

    public T get(int i, int j, int k){
        return vector.get((i * firstDimension * secondDimension) + (j * thirdDimension) + k);
    }

    public static void main(String[] args) {
    }
}

