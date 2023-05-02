package com.lyg.StringDemo;

import java.util.Scanner;

/**
 * @author almost
 * @date 2023/5/2 18:01
 */
public class Reserve {
    public static void main(String[] args) {

        //使用stringbuilder场景:
        //1.字符串的拼接(append)
        //2.字符串的反转(reverse)
        //注意在使用字字符串比较的时候,要用equals,用==会出现错误
        Scanner sca=new Scanner(System.in);
        String total="";
        String str = sca.next();

        StringBuilder sb=new StringBuilder();
        String s = sb.append(str).reverse().toString();
       /* for (int i = str.length()-1; i>=0;i--) {
            char c = str.charAt(i);
            total+=c;
        }*/
       /* System.out.println(str.getClass());
        System.out.println(total.getClass());*/
        if(s.equals(str)){
            System.out.println("该字符串是对称字符串");
        }else {
            System.out.println("该字符串不是对称字符串");
        }
    }
}
