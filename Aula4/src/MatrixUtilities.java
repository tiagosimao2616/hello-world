public class MatrixUtilities {

    public static String show(int[][] matrix) {
        String str = "[";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j<matrix[i].length-1)
                    str += matrix[i][j] + ",";
                else
                    str += matrix[i][j];
            }
            if(i < matrix.length-1)
                str += "\n";
        }
      str += "]";
        return str;
    }

    public static boolean isMatrix(int[][] matrix) {
        int columns = matrix[0].length;
        for (int i = 1; i < matrix.length; i++) {
            if(columns != matrix[i].length)
                return false;
        }
        return true;
    }

    public static boolean isIdentity(int[][] matrix1) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if(i==j && matrix1[i][j] != 1)
                    return false;
                else if (i!=j && matrix1[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] multiplyBy(int[][] matrix, int value) {
        int [][] newMatrix = new int [matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[i][j] = matrix[i][j] * value;
            }
        }
        return newMatrix;
    }

    public static boolean areCompatibleForSum(int[][] matrix, int[][] matrixz) {
        if (matrix.length == matrixz.length){
            for (int i = 0; i < matrix.length; i++) {
                if(matrix[i].length != matrixz[i].length)
                    return false;
            }
        }
        else{
            return false;
        }
        return true;
    }

    public static int[][] sumOf(int[][] matrix, int[][] matrixz) {
        if (areCompatibleForSum(matrix,matrixz)){
            int [][] newMatrix = new int [matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    newMatrix[i][j] = matrix[i][j] + matrixz[i][j];
                }
            }
            return newMatrix;
        }
        else {
            return null;
        }
    }
}
