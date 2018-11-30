package com.example.pikamouse.arithmetic.leetcode.array;

import java.util.Random;

/**
 * create by liting 2018/9/25
 */
public class Array2 {

    public static void main(String[]args){
        //generateRandomCountArray(5,5);
        int[] grades={89, 90, 80, 60, 20, 51, 95};
        int[]res = generateRandomPlayList(grades);
        for(int i : res){
            System.out.print(i + " ");
        }

    }


    private static void generateRandomCountArray(int range,int n){
        int[] arr = new int[range];
        for(int i = 0; i < range; i++){
            arr[i] = i;
        }
        for(int j = 0; j < n; j++){
            Random random = new Random();
            int t = random.nextInt(range - j) + j;
            int temp = arr[t];
            arr[j] = arr[t];
            arr[t] = temp;
            System.out.print(arr[j] + " ");
        }
    }

    /**
     * 假设张三的mp3里有1000首歌，现在希望设计一种随机算法来随机播放。与普通随机模式不同的是，
     * 张三希望每首歌被随机抽到的概率是与一首歌的豆瓣评分（0~10分）成正比的，如朴树的《平凡之路》评分为8.9分，
     * 逃跑计划的《夜空中最亮的星》评分为9.5分，则希望听《平凡之路》的概率与《夜空中最亮的星》的概率比为89:95,
     * 现在我们已知这1000首歌的豆瓣评分
     *
     *①将一千首歌存在数组当中，数组下标对应0-999，数组内容存歌曲的评分；
     * ②随机取0-999中的一个数字，取到之后查看对应的评分，如果评分为9.5，则随机取1-100中的数字，小于等于95则播放这首歌，
     * ③当某一首歌曲被选中后，与最后一首歌曲调换位置，然后随机数减一，等到下一首被选中后，与倒数第二的位置交换，随机数减一，依次类推，
     * ④重复上述②③过程。
     *
     * @param songList
     * @return
     */
    private static int[] generateRandomPlayList(int[]songList){
        int range = songList.length;
        Random songRandom = new Random();
        Random starRandom = new Random();
        for(int i = 0; i < range; i++){
            boolean flag = true;
            while (flag){
                int songCount = songRandom.nextInt(range - i);
                int star = songList[songCount];
                int starCount = starRandom.nextInt(100);
                if(star <= starCount){
                    flag = false;
                    int temp = songList[songCount];
                    songList[songCount] = songList[range - i - 1];
                    songList[range - i - 1] = temp;
                }
            }
        }
        return songList;
    }


    /**
     *
     * 产生一个0～range范围内的随机数数组
     * 例如：范围0～8
     * 产生的随机数组：6 0 2 1 3 4 5 7 8
     *
     * @param range
     * @return
     */
    private static int[] generateRandomCount(int range){
        int[]array = new int[range + 1];
        for(int i = 0; i < range + 1; i++){
            array[i] = i;
        }
        for(int i = 0; i < range + 1; i++){
            Random random = new Random();
            int n = random.nextInt(range + 1 - i) + i;
            int temp = array[n];
            array[n] = array[i];
            array[i] = temp;
        }
        return array;
    }

}
