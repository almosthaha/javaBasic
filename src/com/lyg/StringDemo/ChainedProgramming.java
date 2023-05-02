package com.lyg.StringDemo;

/**
 * @author almost
 * @date 2023/5/2 17:47
 */
public class ChainedProgramming {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb=new StringBuilder();
        //2.添加字符串
        sb.append("aaa").append("bbb").append("ccc").append("ddd");

        System.out.println(sb);
    }
}
