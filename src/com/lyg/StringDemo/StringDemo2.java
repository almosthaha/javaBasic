package com.lyg.StringDemo;

/**
 * @author almost
 * @date 2023/4/30 11:55
 */
public class StringDemo2 {
    public static void main(String[] args) {
        //比较两个字符串是否相等

        //创建两个字符串对象
        String s1=new String("abc");
        String s2="Abc";

        //2.==号比较
        //基本数据类型:比的是数值
        //引用数据类型:比的是地址值
        System.out.println(s1==s2);

        //3.比较字符串内容是否相等
        boolean eq = s1.equals(s2);
        System.out.println(eq);

        //可用于验证码不区分大小写比较,忽略大小写
        boolean b = s1.equalsIgnoreCase(s2);
        System.out.println(b);
    }
}
