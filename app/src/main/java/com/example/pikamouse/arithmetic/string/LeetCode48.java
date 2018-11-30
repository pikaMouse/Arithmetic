package com.example.pikamouse.arithmetic.string;

/**
 * create by liting 2018/10/11
 *
 *
 * 1 2 3     7 8 9     7 4 1
 * 4 5 6  => 4 5 6  => 8 5 2
 * 7 8 9     1 2 3     9 6 3
 *
 *
 */
public class LeetCode48 {



    public static void main(String[]args){
        int[][]matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        roteMatrix(matrix);
    }


    private static void roteMatrix(int[][] matrix){

        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 0; i < rows/2; i++){
            for(int j = 0; j < cols; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[rows - 1 - i][j];
                matrix[rows - 1 - i][j] = temp;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }





        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


    }




}
