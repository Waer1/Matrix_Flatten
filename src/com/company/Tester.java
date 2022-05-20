package com.company;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Random;

public class Tester {
    @Test
    public void MatrixFlattenTest() {
        Random random = new Random();
        Integer[][][] matrix = new Integer[10][5][4];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 4; k++) {
                    matrix[i][j][k] = random.nextInt();
                }
            }
        }
        MatrixFlatten<Integer> matrixFlatten = new MatrixFlatten<Integer>(matrix);
        Assert.assertEquals(matrix[2][4][3], matrixFlatten.get(2, 4, 3));
        Assert.assertEquals(matrix[1][4][2], matrixFlatten.get(1, 4, 2));
        Assert.assertEquals(matrix[8][2][3], matrixFlatten.get(8 ,2, 3));
        Assert.assertEquals(matrix[0][0][0], matrixFlatten.get(0, 0, 0));
        Assert.assertEquals(matrix[9][4][3], matrixFlatten.get(9, 4, 3));
        Assert.assertEquals(matrix[6][1][2], matrixFlatten.get(6, 1, 2));

    }
}
