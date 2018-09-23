package com.example.pikamouse.arithmetic.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * create by liting 2018/9/21
 * 输入: candidates = [2,3,6,7], target = 7,
 * 所求解集为:
 * [
 * [7],
 * [2,2,3],
 * ]
 */
public class LeetCode39 {


    public static void main(String[]args){
        LeetCode39 l = new LeetCode39();
        int[]arr = new int[]{2,3,6,7};
        l.combinationSum(arr,7);


    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List res = new ArrayList<>();
        List tmp = new ArrayList<>();
        helper(candidates, target, res, 0, 0,tmp);
        return res;
    }

    private void helper(int[] candidates, int target, List res, int count, int index, List tmp){
        if(count > target) return;
        if(count == target){
            res.add(new ArrayList<>(tmp));
        }else{
            for(int i = index; i < candidates.length; i++){
                count += candidates[i];
                //target -= count;
                tmp.add(candidates[i]);
                helper(candidates, target, res, count, i, tmp);
                tmp.remove(tmp.size()-1); // 清理现场哈
                count -= candidates[i]; // 清理现场啊哈
            }
        }
    }
}
