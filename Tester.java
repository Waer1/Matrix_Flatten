import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

public class Tester {
    @Test
    public void MatrixFlattenTest() {
        Random ran = new Random();
        Integer[][][] matrix = new Integer[10][5][4];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 4; k++) {
                    matrix[i][j][k] = ran.nextInt();
                }
            }
        }
        MatrixFlatten<Integer> matrixFlatten = new MatrixFlatten<>(matrix);
        Assert.assertEquals(matrix[1][2][3], matrixFlatten.get(1, 2, 3));
        Assert.assertEquals(matrix[5][2][1], matrixFlatten.get(5, 2, 1));
        Assert.assertEquals(matrix[6][2][2], matrixFlatten.get(6, 2, 2));
    }
}
