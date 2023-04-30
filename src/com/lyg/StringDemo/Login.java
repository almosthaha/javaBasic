package com.lyg.StringDemo;

import java.util.Scanner;

/**
 * @author almost
 * @date 2023/4/30 13:10
 */
public class Login {
    public static void main(String[] args) {
        //需求:已知正确的用户名和密码,请用程序实现模拟用户登录。
        //总共给三次机会,登录之后,给出相应的提示

        for (int i = 0; i < 3; i++) {
            String name="zhangsan";
            String password="123456";
            Scanner sca=new Scanner(System.in);
            System.out.println("请输入用户名:");
            String nameNext = sca.next();
            System.out.println("请输入密码:");
            String passwordNext = sca.next();
            if(name.equals(nameNext)&&password.equals(passwordNext)){
                System.out.println("登录成功");
                break;
            }else {
                //运算符跟字符串进行拼接,运算符要使用括号拼接
                System.out.println("登录失败"+"还剩"+(2-i)+"次");
            }
        }
    }
}
