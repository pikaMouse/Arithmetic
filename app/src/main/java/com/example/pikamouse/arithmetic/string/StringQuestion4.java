package com.example.pikamouse.arithmetic.string;

import java.util.ArrayList;
import java.util.List;

/**
 * create by liting 2018/9/21
 */
public class StringQuestion4 {


    public static void main(String[]args){

        String s = "abacabacab";
//        List<Character>list = new ArrayList<>();
//        list.add('c');
//        list.add('b');
//        list.add('a');
//        list.add('c');
//
//        list.remove(((Character) 'c'));
//        for(char s2 : list){
//            System.out.print(s2);
//        }
        System.out.print(find(s));



    }

    /**
     * 未解决
     * @param s
     * @return
     */

    private static String find(String s){
        int len = s.length();
        List<List<Character>> lists = new ArrayList<>();
        for(int i = 0; i < len; i++){
            List<Character> list = new ArrayList<>();
            lists.add(list);
        }
        List<Character> originList = lists.get(0);
        int max = 1;
        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            if(originList.contains(c)){
                int j = 0;
                while (lists.get(j).contains(c)){
                    lists.get(j).remove(((Character) c));
                    if(!lists.get(j + 1).contains(c)){
                        lists.get(j + 1).add(c);
                        break;
                    }
                    j++;
                }
                max = Math.max(max,j);

            }else {
                originList.add(c);
            }
        }
        StringBuffer sb = new StringBuffer();

            List<Character> list = lists.get(1);

                for(char c : list){
                    sb.append(c);
                }



        return sb.toString();
    }
}
