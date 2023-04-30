package com.lyg.StringDemo;

import java.util.Scanner;

/**
 * @author almost
 * @date 2023/4/30 16:56
 */
public class ForString {
    public static void main(String[] args) {
        //键盘录入一个字符串,使用程序实现在控制台遍历该字符串
        Scanner sca=new Scanner(System.in);
        System.out.println("请输入字符串的内容:");
        String next = sca.next();
        for (int i = 0; i < next.length(); i++) {
            char c = next.charAt(i);
            System.out.println(c);
        }
        System.out.println(123);
    }
}
