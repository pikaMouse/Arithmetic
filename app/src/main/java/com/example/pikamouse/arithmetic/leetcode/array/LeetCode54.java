package com.example.pikamouse.arithmetic.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * create by liting 2018/10/16
 */
public class LeetCode54 {

    public static void main(String[]args){
        //int[][]m = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][]m = new int[][]{{1,2},{2,3},{3,4},{4,4},{4,8},{6,9}};
                 List<Integer> list = new LeetCode54().spiralOrder1(m);
        for(int i : list){
            System.out.print(i);
        }
    }

//    public List<Integer> spiralOrder(int[][] matrix) {
//        if(matrix == null || matrix.length == 0){
//            return null;
//        }
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//        int startX = 0;
//        int startY = 0;
//        int endX = rows - 1;
//        int endY = cols - 1;
//        List<Integer>list = new ArrayList<>();
//        while (startX <= rows/2){
//            if(startX == endX){
//               for(int i = startX; i <= endY; i++){
//                   list.add(matrix[startX][i]);
//               }
//               break;
//
//            }
//            if(startY == endY){
//                for (int i = startY; i <= endX; i++){
//                    list.add(matrix[i][startY]);
//                }
//                break;
//
//            }
//            int i = startY;
//            while (i < endY){
//                list.add(matrix[startX][i]);
//                i++;
//            }
//
//            int j = startX;
//            while (j < endX){
//                list.add(matrix[j][endY]);
//                j++;
//            }
//
//            while (i > startY ){
//                list.add(matrix[endX][i]);
//                i--;
//            }
//            while (j > startX){
//                list.add(matrix[j][startY]);
//                j--;
//            }
//            startX++;
//            startY++;
//            endX--;
//            endY--;
//        }
//        return list;
//    }

    public List<Integer> spiralOrder1(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if(matrix.length == 0 || matrix[0].length == 0) return res;

        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(true){
            for(int i = left; i <= right; i++) res.add(matrix[top][i]);
            top++;
            if(left > right || top > bottom) break;

            for(int i = top; i <= bottom; i++) res.add(matrix[i][right]);
            right--;
            if(left > right || top > bottom) break;

            for(int i = right; i >= left; i--) res.add(matrix[bottom][i]);
            bottom--;
            if(left > right || top > bottom) break;

            for(int i = bottom; i >= top; i--) res.add(matrix[i][left]);
            left++;
            if(left > right || top > bottom) break;
        }

        return res;
    }
}
