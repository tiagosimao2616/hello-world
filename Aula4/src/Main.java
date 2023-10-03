// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        int [] [] matrix = {{2,0,1},{7,9,2}};
        int [] [] matrixz = {{1,1,1},{6,8,1}};
        int [] [] matrix1 = {{1,0,0},{0,1,0},{0,0,1}};

        boolean tf = MatrixUtilities.isMatrix(matrix);
        System.out.println(tf);

        boolean identity = MatrixUtilities.isIdentity(matrix1);
        System.out.println(identity);

        int[][] mult = MatrixUtilities.multiplyBy(matrix,3);
        System.out.println(MatrixUtilities.show(mult));

        boolean comp = MatrixUtilities.areCompatibleForSum(matrix,matrixz);
        System.out.println(comp);

        int [] [] sum = MatrixUtilities.sumOf(matrix,matrixz);
        System.out.println(MatrixUtilities.show(sum));
    }



}