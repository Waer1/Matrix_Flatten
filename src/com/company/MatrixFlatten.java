package com.company;

import java.util.ArrayList;

public class MatrixFlatten<T extends Comparable<T>> {
    private final ArrayList<T> vector;
    private int firstDim;
    private int secondDim;
    private int thirdDim;

    public MatrixFlatten(T[][][] matrix){
        firstDim = matrix.length;
        secondDim = matrix[0].length;
        thirdDim = matrix[0][0].length;
        vector = new ArrayList<>(firstDim * secondDim * thirdDim);
        for (int i = 0; i < firstDim; i++) {
            for (int j = 0; j < secondDim; j++) {
                for (int k = 0; k < this.thirdDim; k++) {
                    vector.add(matrix[i][j][k]);
                }
            }
        }
    }

    public T get(int i, int j, int k){
        return vector.get( (i * secondDim * thirdDim) + (j * thirdDim) + k);
    }
}
