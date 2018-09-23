package com.example.pikamouse.arithmetic.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * create by liting 2018/9/15
 */
public class StringQuestion1 {


    public static void main(String[] args){
        String str = "abcbcbcbc";
        Map<Integer,String> rs = fun(str);
        System.out.println(rs.toString());
    }


    public static Map<Integer,String> fun(String str){
        Map<Integer,String> map = new HashMap<>();
        Vector<String> substrs = new Vector<>();
        int maxCount = 1,count =1;
        String substr = null;
        int i,len = str.length();
        for(i=0;i<len;i++){
            substrs.add(i, str.substring(i, len));
        }
        //System.out.println(substrs.toString());
        for(i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                count = 1;
                if( substrs.get(j).length()>=j-i && substrs.get(i).substring(0,j-i).equals(substrs.get(j).substring(0,j-i))){
                    ++count;
                    for(int k=j+(j-i);k<len;k+=j-i){
                        //System.out.println(i+" "+j+" "+k+" "+count);
                        if(substrs.get(k).length()>=j-i && ( substrs.get(i).substring(0,j-i) ).equals( substrs.get(k).substring(0,j-i) )){
                            count++;
                        }else{
                            break;
                        }
                    }
                    if(count>maxCount){
                        maxCount = count;
                        substr = substrs.get(i).substring(0,j-i);
                    }
                }
            }
        }
        map.put(maxCount, substr);
        return map;

    }











    private static int findMaxLengthSubStr(String s){
        if(s == null || s.length() == 0){
            return 0;
        }
        int len = s.length();
        int maxCount = 0;
        int count = -1;
        String as = "";
        String[][]strings = new String[len][len];
        //abcbcabc bcbcabc cbcabc bcabc cabc abc bc c
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len - i; j++){
                strings[i][j] = s.substring(i,i + j + 1);
            }
        }

        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(strings[j][i] != null){
                    for(int k = 0; k < len; k++){

                    }
                }
            }
        }




        return as.length();
    }
}
