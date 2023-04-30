package com.lyg.StringDemo;

/**
 * @author almost
 * @date 2023/4/30 1:02
 */
public class StringDemo1 {
    public static void main(String[] args) {

        int[] arr={1,2,3};
        System.out.println(arr);
        //1.使用直接赋值的方式获取一个字符串对象
        String s1="abc";
        System.out.println(s1);

        //2.使用new的方式来获取一个字符串对象
        //空参构造:可以获取一个空白的字符串对象
        //在字符串中可以传递形参,但是不推荐
        //字符串对象中国的形参可以使用变量名,这样比较合适
        String s2=new String();
        System.out.println("@"+s2+"!");

        //传递一个字符数组,根据字符数组再创建一个对象
        char[] chr={'a','b','c','d'};
        String str=new String(chr);
        System.out.println(str);

        byte[] bytes={97,98,99,100};
        String s5=new String(bytes);
        System.out.println(s5);
    }
}
