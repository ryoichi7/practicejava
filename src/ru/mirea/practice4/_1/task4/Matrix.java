package ru.mirea.practice4._1.task4;

public class Matrix {
    public static void main(String[] args){
        Matrix matrix1 = new Matrix(3,4);
        System.out.println("Matrix1:");
        matrix1.soutMatrix();
        Matrix matrix2 = new Matrix(3,4);
        System.out.println("Matrix2:");
        matrix2.soutMatrix();
        System.out.println("matrix1 + matrix2:");
        matrix1.addToMatrix(matrix2);
        matrix1.soutMatrix();
        int multiplier = (int)(Math.random() * 50);
        System.out.printf("matrix1 * %d:\n", multiplier);
        matrix1.multiplyMatrix(multiplier);
        matrix1.soutMatrix();
    }
    public int getRowsCount() {
        return rowsCount;
    }

    public int getColumnsCount() {
        return columnsCount;
    }
    public int[][] getMatrix() {
        return matrix;
    }

    private int[][] matrix;
    private int rowsCount;
    private int columnsCount;

    Matrix(int rowsCount, int columnsCount){
        this.rowsCount = rowsCount;
        this.columnsCount = columnsCount;
        matrix = new int[rowsCount][columnsCount];
        for (int i = 0; i < rowsCount; ++i){
            for (int j = 0; j < columnsCount; ++j){
                matrix[i][j] = (int) (Math.random() * 50);
            }
        }
    }

    public void soutMatrix(){
        for (int i = 0; i < rowsCount; ++i){
            for (int j = 0; j < columnsCount; ++j){
                System.out.printf(matrix[i][j] + " ");
                if (j + 1 == columnsCount) System.out.println();
            }
        }
    }

    public void addToMatrix(Matrix newMatrix){
        if (newMatrix.getColumnsCount() == this.columnsCount && newMatrix.getRowsCount() == this.rowsCount){
            for (int i = 0; i < rowsCount; ++i){
                for (int j = 0; j < columnsCount; ++j){
                    matrix[i][j] += newMatrix.getMatrix()[i][j];
                }
            }
        }
        else {
            System.out.println("Unable to sum matrix with different dimensions");
        }
    }

    public void multiplyMatrix(int multiplier){
        for (int i = 0; i < rowsCount; ++i){
            for (int j = 0; j < columnsCount; ++j){
                matrix[i][j] *= multiplier;
            }
        }
    }
}
