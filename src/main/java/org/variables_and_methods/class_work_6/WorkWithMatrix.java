package org.variables_and_methods.class_work_6;

public class WorkWithMatrix {
    public void printMatrix(int[][] matrixForPrinting){
        System.out.println("------");
        for (int m = 0; m < matrixForPrinting.length; m++) {
            for (int i = 0; i < matrixForPrinting[m].length ; i++) {
                System.out.print(matrixForPrinting[m][i] + " ");
            }
            System.out.println();

        }
    }

    public int[][] createSquareMatrix(int size) {
        int[][] tempMatrix = new int[size][size];
//        int counter = 0;
        for (int i = 0; i <tempMatrix.length ; i++) {
            for (int j = 0; j < tempMatrix.length; j++) {
                tempMatrix[i][j] = j + tempMatrix.length * i;

//                counter ++;
            }
        }
        printMatrix(tempMatrix);
        return tempMatrix;
    }
}
