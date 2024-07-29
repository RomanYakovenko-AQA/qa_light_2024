package org.variables_and_methods.class_work_6;

public class MainClassMatrix {
    public static void main(String[] args) {
       int [][] matrix = {{1,2,3}, {4,5}, {7,8,9,10}};
        System.out.println("Number of rows = " +matrix.length);
        System.out.println("Number of elements in 3 row (index 2) = "+ matrix[2].length);
        System.out.println("Element = "+ matrix[2][1]);

        WorkWithMatrix workWithMatrix = new WorkWithMatrix();
        workWithMatrix.printMatrix(matrix);

        workWithMatrix.createSquareMatrix(4);


    }
}
