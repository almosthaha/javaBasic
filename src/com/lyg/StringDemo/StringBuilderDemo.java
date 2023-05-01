package com.lyg.StringDemo;

/**
 * @author almost
 * @date 2023/5/2 17:14
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb=new StringBuilder();

        //2.添加字符串
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");

        System.out.println(sb.getClass());

        //3.再把stringbuilder变回字符串
        //这里为什么要变回字符串
        String str=sb.toString();
        System.out.println(str.getClass());

    }
}
